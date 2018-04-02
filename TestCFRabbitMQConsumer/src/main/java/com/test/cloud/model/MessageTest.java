package com.test.cloud.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the message_test database table.
 * 
 */
@Entity
@Table(name="message_test")
public class MessageTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="int_val")
	private Integer intVal;

	@Column(name="str_val")
	private String strVal;

	public MessageTest() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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