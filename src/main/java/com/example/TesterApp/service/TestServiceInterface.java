package com.example.TesterApp.service;

import com.example.TesterApp.customexceptions.BadRequestException;
import com.example.TesterApp.dto.DataDTO;
import com.example.TesterApp.models.TestModel;

/**
 * Service layer of the application
 *
 */
public interface TestServiceInterface {

	/**
	 * finds data by name
	 * 
	 * @param name
	 * @return
	 * @throws BadRequestException 
	 */
	public TestModel getData(String name) throws BadRequestException;

	/**
	 * saves the data into the database
	 * 
	 * @param model
	 * @throws BadRequestException 
	 */
	public void postData(DataDTO data) throws BadRequestException;

	/**
	 * updates the data based on name
	 * 
	 * @param model
	 * @throws BadRequestException 
	 */
	public void updateData(DataDTO data) throws BadRequestException;

	/**
	 * deletes data based on name
	 * 
	 * @param name
	 * @throws BadRequestException 
	 */
	public void deleteData(String name) throws BadRequestException;
}
