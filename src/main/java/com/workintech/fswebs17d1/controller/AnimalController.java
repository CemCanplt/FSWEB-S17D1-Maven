package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {

    private Map<Integer, Animal> animals = new HashMap<>();

    // [GET] Tüm hayvanların listesini döner
    @GetMapping
    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animals.values());
    }

    // [GET] Belirli bir ID'ye ait hayvanı döner
    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable Integer id) {
        return animals.get(id);
    }

    // [POST] Yeni bir hayvan ekler
    @PostMapping
    public String addAnimal(@RequestBody Animal animal) {
        animals.put(animal.getId(), animal);
        return "Animal added successfully!";
    }


    // [PUT] Bir hayvanın bilgilerini günceller
    @PutMapping("/{id}")
    public String updateAnimal(@PathVariable Integer id, @RequestBody Animal updatedAnimal) {
        if (animals.containsKey(id)) {
            animals.put(id, updatedAnimal);
            return "Animal updated successfully!";
        } else {
            return "Animal with ID " + id + " not found!";
        }
    }

    // [DELETE] Bir hayvanı siler
    @DeleteMapping("/{id}")
    public String deleteAnimal(@PathVariable Integer id) {
        if (animals.containsKey(id)) {
            animals.remove(id);
            return "Animal deleted successfully!";
        } else {
            return "Animal with ID " + id + " not found!";
        }
    }
}
