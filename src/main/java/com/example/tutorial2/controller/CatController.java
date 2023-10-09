package com.example.tutorial2.controller;

import com.example.tutorial2.model.Cat;
import com.example.tutorial2.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cats")
public class CatController {

    @Autowired
    CatService catService;

    @GetMapping
    public List getCats() {
        return catService.getCats();
    }

    @GetMapping("/{id}")
    public Optional<Cat> getCat(@PathVariable String id) {
        return catService.getCat(id);
    }

    @PostMapping
    public String saveCat(@RequestBody Cat cat) {
        return catService.save(cat);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cat> updateCat(@PathVariable String id, @RequestBody Cat cat) { return catService.updateCat(id, cat); }

    @DeleteMapping("/{id}")
    public boolean deleteCat(@PathVariable String id) { return catService.deleteCat(id); }

}
