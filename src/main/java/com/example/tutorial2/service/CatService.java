package com.example.tutorial2.service;

import com.example.tutorial2.model.Cat;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CatService {

    String save(Cat cat);

    List<Cat> getCats();

    Optional<Cat> getCat(String id);

    ResponseEntity<Cat> updateCat(String id, Cat cat);

    boolean deleteCat(String id);
}
