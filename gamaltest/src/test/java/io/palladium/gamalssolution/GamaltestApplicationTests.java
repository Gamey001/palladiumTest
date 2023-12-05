package io.palladium.gamalssolution;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.palladium.gamalssolution.controllers.UserController;
import io.palladium.gamalssolution.models.User;

@SpringBootTest
class GamaltestApplicationTests {
	@Autowired
	UserController userController;

	@Test
	public void deleteUser() {
		User user = new User("user1", "user1@gmail.com", "00123456", "current date", false);
		userController.deleteUser(user.getUsername());
		assertFalse(userController.getAllUsers().contains(user));
	}

}
