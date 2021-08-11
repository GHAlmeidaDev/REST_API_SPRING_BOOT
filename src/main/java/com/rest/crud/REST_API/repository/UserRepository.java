package com.rest.crud.REST_API.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rest.crud.REST_API.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByNameContaining(String name);
    List<User> findByPublished(boolean published);
}