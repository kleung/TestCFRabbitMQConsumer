package com.test.cloud.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the test database table.
 * 
 */
@Entity
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="bool_Val")
	private Boolean boolVal;

	@Column(name="date_Val")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVal;

	@Column(name="int_Val")
	private Integer intVal;

	@Column(name="str_Val")
	private String strVal;

	public Test() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getBoolVal() {
		return this.boolVal;
	}

	public void setBoolVal(Boolean boolVal) {
		this.boolVal = boolVal;
	}

	public Date getDateVal() {
		return this.dateVal;
	}

	public void setDateVal(Date dateVal) {
		this.dateVal = dateVal;
	}

	public Integer getIntVal() {
		return this.intVal;
	}

	public void setIntVal(Integer intVal) {
		this.intVal = intVal;
	}

	public String getStrVal() {
		return this.strVal;
	}

	public void setStrVal(String strVal) {
		this.strVal = strVal;
	}

}