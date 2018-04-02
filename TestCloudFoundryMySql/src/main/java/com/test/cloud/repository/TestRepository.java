package com.test.cloud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.cloud.model.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
	
	public List<Test> findByStrValOrderById(String strVal);
	
	@Query("select d from Test d where d.id = ?1")
	public Test findByIdQuery(Long id);

}
