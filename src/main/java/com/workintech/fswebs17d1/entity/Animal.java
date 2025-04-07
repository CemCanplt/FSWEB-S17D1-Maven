package com.workintech.fswebs17d1.entity;

public class Animal {
    private Integer id;
    private String name;

    // Getter ve Setter metodları
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    public Animal(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // Default Constructor
    public Animal() {
    }
}
