package com.example.tutorial2.service;

import com.example.tutorial2.model.Cat;
import com.example.tutorial2.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatServiceImpl implements CatService {

    @Autowired
    private CatRepo catRepo;

    @Override
    public String save(Cat cat) {
        return catRepo.save(cat).getId();
    }

    @Override
    public List<Cat> getCats() {
        return catRepo.findAll();
    }

    @Override
    public Optional<Cat> getCat(String id) {
        return catRepo.findById(id);
    }

    @Override
    public ResponseEntity<Cat> updateCat(String id, Cat cat) {
        Optional<Cat> catData = catRepo.findById(id);
        if(catData.isPresent()) {
            return new ResponseEntity<>(catRepo.save(cat), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public boolean deleteCat(String id) {
        catRepo.deleteById("5");
        return true;
    }
}
