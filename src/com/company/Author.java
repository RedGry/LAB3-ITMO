package com.company;

public class Author extends Human {
    Author(String name, Gender gender) {
        super(name, gender);
    }

    public void speak(String text){
        System.out.println("Слова автора >>" + text);
    }
}
