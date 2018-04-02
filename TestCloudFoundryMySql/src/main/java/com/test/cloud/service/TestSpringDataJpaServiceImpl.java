package com.test.cloud.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.cloud.model.Test;
import com.test.cloud.repository.TestRepository;

@Service
public class TestSpringDataJpaServiceImpl implements TestSpringDataJpaService {

	@Autowired
	protected TestRepository testRepository;
	
	@Autowired
	//@Qualifier("dataSource")
	protected DataSource dataSource;
	
	public TestSpringDataJpaServiceImpl() {
		super();
	}
	
	@Override
	@Transactional
	public Test persistTestData(Test data) {
		this.testRepository.save(data);
		
		return data;
	}

	@Override
	@Transactional
	public void deleteTestData(Test data) {
		this.testRepository.delete(data);
	}

	@Override
	public Test findValidTestDataById(Long id) {
		Test result = this.testRepository.findByIdQuery(id);
		
		return result;
	}

	@Override
	@Transactional
	public Test updateTestData(Test data) {
		Test target = this.testRepository.findByIdQuery(data.getId());
		
		if(target == null) {
			throw new EntityNotFoundException("Target data not found.");
		}
		
		String updatedStrVal = data.getStrVal();
		if(updatedStrVal != null)
			target.setStrVal(updatedStrVal);
		
		Date updatedTimeVal = target.getDateVal();
		if(updatedTimeVal != null)
			target.setDateVal(updatedTimeVal);
		
		this.testRepository.save(target);
		
		return target;
	}

	@Override
	public List<Test> findValidTestDataByStrVal(String strVal) {
		List<Test> result = this.testRepository.findByStrValOrderById(strVal);
		
		return result;
	}

}
