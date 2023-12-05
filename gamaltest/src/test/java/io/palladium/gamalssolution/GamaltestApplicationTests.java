package io.palladium.gamalssolution;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GamaltestApplicationTests {

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.gamabrains.springbootquickstart.courseapi.controllers.TopicController;
import io.gamabrains.springbootquickstart.courseapi.models.Topic;
import io.palladium.gamalssolution.controllers.UserController;
import io.palladium.gamalssolution.models.User;

@SpringBootTest
class CourseapiApplicationTests {
	@Autowired
	UserController userController;

	@Test
	public void deleteUser() {
		User user = new User("user1", "user1@gmail.com", "00123456", "current date", false);
		userController.deleteUser(user.getUsername());
		assertFalse(userController.getAllUsers().contains(user));
	}

}
