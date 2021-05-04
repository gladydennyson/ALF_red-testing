package com.example.TesterApp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TesterApp.dto.DataDTO;
import com.example.TesterApp.models.TestModel;
import com.example.TesterApp.service.TestServiceInterface;

/**
 * Controller to test the alfred application
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class TestController {

	@Autowired
	TestServiceInterface tst;

	/**
	 * Get method, throws an exception if the name contains a number, Logging will
	 * be done for exception logger, event logger and health logger
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/v1/user/{userId}")
	public ResponseEntity<TestModel> getWithoutException(@PathVariable("userId") String userId) throws Exception {
		return new ResponseEntity<TestModel>(tst.getData(userId), HttpStatus.OK);
	}

	/**
	 * Post method, throws an exception if the name field in the request body
	 * contains a number, Logging will be done for exception logger, event logger
	 * and health logger
	 * 
	 * @param requestBody
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/v1/user/{userId}/submit")
	public ResponseEntity<String> postWithoutException(@Valid @RequestBody DataDTO requestBody,
			@PathVariable("userId") String userId) throws Exception {
		tst.postData(requestBody);
		return new ResponseEntity<String>("Done", HttpStatus.CREATED);
	}

	/**
	 * Put method, throws an exception if the name field in the request body
	 * contains a number, Logging will be done for exception logger, event logger
	 * and health logger
	 * 
	 * @param requestBody
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@PutMapping("/v1/user/{userId}/update")
	public ResponseEntity<String> putWithoutException(@Valid @RequestBody DataDTO requestBody,
			@PathVariable("userId") String userId) throws Exception {
		tst.updateData(requestBody);
		return new ResponseEntity<String>("Done", HttpStatus.CREATED);
	}

	/**
	 * Delete method, throws an exception if the name contains a number, Logging
	 * will be done for exception logger, event logger and health logger
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping("/v1/user/{userId}")
	public ResponseEntity<String> deleteWithoutException(@PathVariable("userId") String userId) throws Exception {
		tst.deleteData(userId);
		return new ResponseEntity<String>("Done", HttpStatus.CREATED);
	}

	/**
	 * Get method, throws exception, Logging will be done for exception logger,
	 * event logger and health logger
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/v1/user/{userId}/exception")
	public ResponseEntity<TestModel> getWithException(@PathVariable("userId") String userId) throws Exception {
		TestModel t = new TestModel();
		t.setName((1 / 0) + "");
		return new ResponseEntity<TestModel>(t, HttpStatus.OK);
	}

}
