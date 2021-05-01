package com.example.TesterApp.repository;

import com.example.TesterApp.models.TestModel;

public interface TestRepoInterface{

	public TestModel findByName(String name);
	
	public void save(TestModel model);	
}
