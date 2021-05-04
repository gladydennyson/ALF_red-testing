package com.example.TesterApp.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * DTO to get the data.
 *
 */
public class DataDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Validation
	 */
	@NotNull
	private String name;

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
	
}
