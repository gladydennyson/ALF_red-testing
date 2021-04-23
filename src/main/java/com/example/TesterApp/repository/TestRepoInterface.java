package com.example.TesterApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.TesterApp.models.TestModel;

@Repository
public interface TestRepoInterface extends MongoRepository<TestModel, ObjectId>{

	public TestModel findByName(String name);
}
