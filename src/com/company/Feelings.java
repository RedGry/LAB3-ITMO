package com.company;

public enum Feelings {
    EXCESS("избыточными"), //Избыток
    GLADNESS ("радостными"), //Радость
    ANGER("злыми"), //Злость
    ANGRY("сердитыми"), //Сердитый
    RUSH ("торопливыми"), //Торопиться
    DISAPPROVINGLY (" неодобрительными "); // Неодобрительно

    private String feel;

    Feelings(String feel) {
        this.feel = feel;
    }

    public String getFeel() {
        return feel;
    }
}
