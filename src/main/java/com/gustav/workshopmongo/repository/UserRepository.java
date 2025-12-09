package com.gustav.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gustav.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
