package com.company;

public class Place {
    private String name;
    private Coordinates location;

    public Place(String _name){
        name = _name;
        location = null;
        System.out.println("Место - " + name + " ( " + location.getName() + " )");
    }

    public Place(String _name, Coordinates _location){
        name = _name;
        location = _location;
        System.out.println("Место - " + name + " ( " + location.getName() + " )");
    }

    public String getName(){ return name == null ? "..." : name; }
    public Coordinates getLocation() {return location;}


}
