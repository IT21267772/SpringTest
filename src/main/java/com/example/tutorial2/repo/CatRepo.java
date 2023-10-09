package com.example.tutorial2.repo;

import com.example.tutorial2.model.Cat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepo extends MongoRepository<Cat, String> {
}
