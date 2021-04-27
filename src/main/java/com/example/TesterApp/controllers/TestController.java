package com.example.TesterApp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.TesterApp.customexceptions.BadRequestException;
import com.example.TesterApp.dto.DataDTO;
import com.example.TesterApp.models.TestModel;
import com.example.TesterApp.service.TestServiceInterface;

@RestController
@CrossOrigin(origins = "*")
public class TestController {
	
	@Autowired
	TestServiceInterface tst;

	@PostMapping("/v1/user/{userId}/data/submit")
	public ResponseEntity<String> postData(@Valid @RequestBody DataDTO requestBody,
			@PathVariable("userId") String userId, @RequestHeader("header") String head) throws Exception {
		tst.putData(requestBody);
		return new ResponseEntity<String>("Done", HttpStatus.CREATED);
	}

	@GetMapping("/v1/user/{userId}/data")
	public ResponseEntity<TestModel> getData(@PathVariable("userId") String userId, @RequestHeader("header") String head) throws Exception {
		return new ResponseEntity<TestModel>(tst.getData(userId), HttpStatus.OK);
	}
	
	@GetMapping("/v1/user/{userId}/exception")
	public ResponseEntity<TestModel> getException(@PathVariable("userId") String userId) throws Exception {
		TestModel t=new TestModel();
		t.setName((1/0)+"");
		return new ResponseEntity<TestModel>(t, HttpStatus.OK);
	}
	
	@GetMapping("/v1/user/{userId}/exception/custom")
	public ResponseEntity<TestModel> getCustomException(@PathVariable("userId") String userId) throws Exception {
		throw new BadRequestException("custom exception");
	}

}
