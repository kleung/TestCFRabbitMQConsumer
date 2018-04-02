package com.test.cloud.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.cloud.model.Test;
import com.test.cloud.service.TestSpringDataJpaService;

@RestController
@RequestMapping(value="/api")
public class TestSpringDataJpaRestController {
	
	@Autowired
	protected TestSpringDataJpaService testDataService;
	
	public TestSpringDataJpaRestController() {
		super();
	}
	
	@RequestMapping(value="/persist", method=RequestMethod.POST, produces="application/json", consumes="application/json")
	public Test persistTestData(@RequestBody Test data) {
		return this.testDataService.persistTestData(data);
	}
	
	@RequestMapping(value="/Test/{id}", method=RequestMethod.GET, produces="application/json")
	public Test findValidTestDataById(@PathVariable Long id) {
		return this.testDataService.findValidTestDataById(id);
	}
	
	@RequestMapping(value="/Test/StrVal/{strVal}", method=RequestMethod.GET, produces="application/json")
	public List<Test> findValidTestDataByStrVal(@PathVariable String strVal) {
		return this.testDataService.findValidTestDataByStrVal(strVal);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT, produces="application/json", consumes="application/json")
	public Test putUpdateTestData(@RequestBody Test data) {
		return this.testDataService.updateTestData(data);
	}

}
