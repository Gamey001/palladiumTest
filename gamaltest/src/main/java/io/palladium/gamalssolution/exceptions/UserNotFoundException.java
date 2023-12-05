package io.palladium.gamalssolution.exceptions;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String id) {
		super("User withe id: " + id + "does not exist");
	}
}
