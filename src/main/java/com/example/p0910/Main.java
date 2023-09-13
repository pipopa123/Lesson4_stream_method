package com.example.p0910;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> personInfo = new HashMap<>();

        List<String> tanakaFavoriteFood = Arrays.asList("ラーメン", "ピザ", "寿司");
        Person tanaka = new Person("田中", tanakaFavoriteFood, "60kg");
        personInfo.put("田中", tanaka);

        List<String> inoueFavoriteFood = Arrays.asList("ラーメン", "ピザ", "パクチー");
        Person inoue = new Person("井上", inoueFavoriteFood, "50kg");
        personInfo.put("井上", inoue);

        List<String> suzukiFavoriteFood = Arrays.asList("ピザ", "ウインナー", "パスタ");
        Person suzuki = new Person("鈴木", suzukiFavoriteFood, "70kg");
        personInfo.put("鈴木", suzuki);

        long ramenLover = personInfo.entrySet().stream().filter(entry -> entry.getValue().getFavoriteFood().contains("ラーメン")).count();
        long pizzaLover = personInfo.entrySet().stream().filter(entry -> entry.getValue().getFavoriteFood().contains("ピザ")).count();
        System.out.println("ラーメン好きな人は " + ramenLover + " 人");
        System.out.println("ピザが好きな人は " + pizzaLover + " 人");

        for (Person person : personInfo.values()) {
            System.out.println(person);
        }
    }
}

