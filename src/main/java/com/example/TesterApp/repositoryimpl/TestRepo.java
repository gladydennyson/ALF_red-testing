package com.example.TesterApp.repositoryimpl;

import org.springframework.stereotype.Repository;

import com.example.TesterApp.models.TestModel;
import com.example.TesterApp.repository.TestRepoInterface;

/**
 * Implementation of the dummy repository
 *
 */
@Repository
public class TestRepo implements TestRepoInterface {

	/**
	 * finds data by name
	 * 
	 * @param name
	 * @return
	 */
	@Override
	public TestModel findByName(String name) {
		TestModel test = new TestModel();
		test.setName("Demo");
		test.setSsn(123456789);
		return test;
	}

	/**
	 * saves the data into the database
	 * 
	 * @param model
	 */
	@Override
	public void save(TestModel model) {
		// database connection save data
	}

	/**
	 * updates the data based on name
	 * 
	 * @param model
	 */
	@Override
	public void update(TestModel model) {
		// database connection to update data

	}

	/**
	 * deletes data based on name
	 * 
	 * @param name
	 */
	@Override
	public void delete(String name) {
		// database connection to delete data

	}

}
