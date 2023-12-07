package io.palladium.gamalssolution.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserNotFoundExceptionAdvice {

	@ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String, String> exceptionHandler(UserNotFoundException e) {
		Map<String, String> errMapp = new HashMap<>();

		errMapp.put("Error: ", e.getMessage());
		return errMapp;
	}

}
