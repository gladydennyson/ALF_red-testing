package com.example.TesterApp.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class DataDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
