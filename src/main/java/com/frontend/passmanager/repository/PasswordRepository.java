package com.frontend.passmanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.frontend.passmanager.model.Password;

@Repository
public interface PasswordRepository extends MongoRepository<Password, String>{
	
	
	
}
