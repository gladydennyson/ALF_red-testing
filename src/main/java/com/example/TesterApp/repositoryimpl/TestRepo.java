package com.example.TesterApp.repositoryimpl;

import org.springframework.stereotype.Repository;

import com.example.TesterApp.models.TestModel;
import com.example.TesterApp.repository.TestRepoInterface;

@Repository
public class TestRepo implements TestRepoInterface{

	public TestModel findByName(String name){
		return new TestModel();
	}
	
	public void save(TestModel model){

	}
	
}
