package com.example.TesterApp.customexceptions;

import org.springframework.http.HttpStatus;

import com.example.alfred.exception.AspectException;

public class BadRequestException extends AspectException {


	public BadRequestException(String message) {
		super(message);
	}

	@Override
	protected void setStatus() {
		status = HttpStatus.BAD_REQUEST;

	}

}
