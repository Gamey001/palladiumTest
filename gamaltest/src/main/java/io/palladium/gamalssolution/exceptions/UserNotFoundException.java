package io.palladium.gamalssolution.exceptions;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String id) {
		super("User with id: " + id + " does not exist");
	}
}
