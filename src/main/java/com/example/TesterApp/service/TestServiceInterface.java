package com.example.TesterApp.service;

import com.example.TesterApp.dto.DataDTO;
import com.example.TesterApp.models.TestModel;

public interface TestServiceInterface {
	
	public TestModel getData(String name) throws Exception;

	public void putData(DataDTO data);
}
