package com.email.repository;

import com.email.entity.CheckEmailValidator;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CheckEmailValidatorRepository extends MongoRepository<CheckEmailValidator, Long> {
}
