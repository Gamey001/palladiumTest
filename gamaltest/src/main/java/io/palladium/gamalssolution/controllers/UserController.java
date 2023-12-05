package io.palladium.gamalssolution.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.palladium.gamalssolution.models.User;
import io.palladium.gamalssolution.repositories.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable String id) {
		return userRepository.findById(id).orElse(null);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@PathVariable String id, @RequestBody User user) {
		userRepository.save(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	public void updateUser(@PathVariable String id, @RequestBody User user) {
		userRepository.save(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable String id) {
		userRepository.deleteById(id);
	}
}
