package com.example;

import java.util.List;


public class Alex extends Lion {

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    // Друзья
    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    // Где живёт
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    // Переопределяем - у него нет львят
    @Override
    public int getKittens() {
        return 0;
    }
}