package com.example.p0910;

import java.util.List;

public class Person {
    private String name;
    private List<String> favoriteFood;

    private String weight;

    public Person(String name, List<String> favoriteFood, String weight) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(List<String> favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String toString() {
        return this.name + "の好きな食べ物は" + this.favoriteFood + " 体重は" + this.weight;
    }
}

