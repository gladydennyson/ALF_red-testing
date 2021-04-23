package com.example.TesterApp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TesterApp.dto.DataDTO;
import com.example.TesterApp.models.TestModel;
import com.example.TesterApp.repository.TestRepoInterface;
import com.example.TesterApp.service.TestServiceInterface;

@Service
public class TestService implements TestServiceInterface {

	@Autowired
	TestRepoInterface testRepo;

	@Override
	public TestModel getData(String name) throws Exception {
		TestModel model=testRepo.findByName(name);
		return model;
	}

	@Override
	public void putData(DataDTO data) {
		TestModel model=new TestModel();
		model.setName(data.getName());
		testRepo.save(model);
	}

}
