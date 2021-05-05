package com.example.TesterApp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TesterApp.customexceptions.BadRequestException;
import com.example.TesterApp.dto.DataDTO;
import com.example.TesterApp.models.TestModel;
import com.example.TesterApp.repository.TestRepoInterface;
import com.example.TesterApp.service.TestServiceInterface;

/**
 * implementation of the service layer
 *
 */
@Service
public class TestService implements TestServiceInterface {

	@Autowired
	TestRepoInterface testRepo;

	/**
	 * finds data by name
	 * 
	 * @param name
	 * @return
	 * @throws BadRequestException
	 */
	@Override
	public TestModel getData(String name) throws BadRequestException {
		checkName(name);
		TestModel model = testRepo.findByName(name);
		return model;
	}

	/**
	 * saves the data into the database
	 * 
	 * @param model
	 * @throws BadRequestException
	 */
	@Override
	public void postData(DataDTO data) throws BadRequestException {
		checkName(data.getName());
		TestModel model = new TestModel();
		model.setName(data.getName());
		model.setSsn(data.getSsn());
		testRepo.save(model);
	}

	/**
	 * updates the data based on name
	 * 
	 * @param model
	 * @throws BadRequestException
	 */
	@Override
	public void updateData(DataDTO data) throws BadRequestException {
		checkName(data.getName());
		TestModel model = new TestModel();
		model.setName(data.getName());
		model.setSsn(data.getSsn());
		testRepo.update(model);
	}

	/**
	 * deletes data based on name
	 * 
	 * @param name
	 * @throws BadRequestException
	 */
	@Override
	public void deleteData(String name) throws BadRequestException {
		checkName(name);
		testRepo.delete(name);
	}

	/**
	 * validation to check if the name consists a number
	 * 
	 * @param name
	 * @throws BadRequestException
	 */
	private void checkName(String name) throws BadRequestException {
		if (name.matches(".*\\d+.*"))
			throw new BadRequestException("Name cannot have a number");

	}

}
