package com.example.TesterApp.repository;

import com.example.TesterApp.models.TestModel;

/**
 * dummy repo interface
 *
 */
/**
 * @author narul
 *
 */
public interface TestRepoInterface {

	/**
	 * finds data by name
	 * 
	 * @param name
	 * @return
	 */
	public TestModel findByName(String name);

	/**
	 * saves the data into the database
	 * 
	 * @param model
	 */
	public void save(TestModel model);

	/**
	 * updates the data based on name
	 * 
	 * @param model
	 */
	public void update(TestModel model);

	/**
	 * deletes data based on name
	 * 
	 * @param name
	 */
	public void delete(String name);
}
