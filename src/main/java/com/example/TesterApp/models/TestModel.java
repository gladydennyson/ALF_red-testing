package com.example.TesterApp.models;

/**
 * dummy entity model
 *
 */
public class TestModel{


	/**
	 * entity field
	 */
	String name;
	
	/**
	 * entity field
	 */
	Integer ssn;

	/**
	 * getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getter for ssn
	 * @return
	 */
	public Integer getSsn() {
		return ssn;
	}

	/**
	 * setter for name
	 * @param name
	 */
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
}
