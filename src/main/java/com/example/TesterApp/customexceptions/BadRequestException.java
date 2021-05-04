package com.example.TesterApp.customexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception extending the Exception class.
 *
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends Exception {

	/**
	 * Constructor to set the exception message
	 * @param message
	 */
	public BadRequestException(String message) {
		super(message);
	}

}
