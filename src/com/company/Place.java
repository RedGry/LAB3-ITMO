package com.company;

public class Place {
    public double x;
    public double y;
    private String name;

    public Place(String name){
        this.name = name;
        System.out.println("Место - " + name);
    }

    public Place(String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
        System.out.println("Место - " + name + " ( " + getX() + " / " + getY() + " )");
    }

    public String getName(){ return name == null ? "..." : this.name; }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }


}
