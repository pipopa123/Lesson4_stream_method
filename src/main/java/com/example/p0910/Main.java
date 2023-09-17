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

        long ramenLoverCount = personInfo.entrySet().stream().filter(entry -> entry.getValue().getFavoriteFood().contains("ラーメン")).count();
        long pizzaLoverCount = personInfo.entrySet().stream().filter(entry -> entry.getValue().getFavoriteFood().contains("ピザ")).count();
        System.out.println("ラーメン好きな人は " + ramenLoverCount + " 人");
        System.out.println("ピザが好きな人は " + pizzaLoverCount + " 人");

        for (Person person : personInfo.values()) {
            System.out.println(person);
        }
        double totalWeight = 0.0;
        int personCount = 0;

        for (Person person : personInfo.values()) {
            String weightString = person.getWeight();
            try {
                double weight = Double.parseDouble(weightString.replace("kg", "").trim());
                totalWeight += weight;
                personCount++;
            } catch (NumberFormatException e) {
                System.out.println(person.getName() + "の体重が無効です");
            }
        }
        double averageWeight = totalWeight / personCount;
        System.out.println("平均体重：" + averageWeight + "kg");
    }
}



