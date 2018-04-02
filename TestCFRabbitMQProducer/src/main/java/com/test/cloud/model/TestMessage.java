package com.test.cloud.model;

import java.io.Serializable;

public class TestMessage implements Serializable {
	
	private static final long serialVersionUID = 2383982103312320582L;

	private Long id;
	
	private Integer intVal;
	
	private String strVal;
	
	public TestMessage() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIntVal() {
		return intVal;
	}

	public void setIntVal(Integer intVal) {
		this.intVal = intVal;
	}

	public String getStrVal() {
		return strVal;
	}

	public void setStrVal(String strVal) {
		this.strVal = strVal;
	}
	
}
