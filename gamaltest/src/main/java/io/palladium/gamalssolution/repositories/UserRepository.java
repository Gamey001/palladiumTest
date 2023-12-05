package io.palladium.gamalssolution.repositories;

import org.springframework.data.repository.CrudRepository;

import io.palladium.gamalssolution.models.User;

public interface UserRepository extends CrudRepository<User, String> {

}