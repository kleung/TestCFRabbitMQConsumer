package com.test.cloud.service;

import java.util.List;

import com.test.cloud.model.Test;

public interface TestSpringDataJpaService {

	public Test persistTestData(Test data);
	
	public void deleteTestData(Test data);
	
	public List<Test> findValidTestDataByStrVal(String strVal);
	
	public Test findValidTestDataById(Long id);
	
	public Test updateTestData(Test data);
}
