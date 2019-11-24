package com.company;

public abstract class AOBJ implements IOBJ{
    private String name;
    protected static TypeOBJ type1;
    protected Place place;
    protected double x;
    protected double y;

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.x;
    }
    public double setY(double y){
        this.y = y;
        return this.x;
    }
    public double setX(double x){
        this.x = x;
        return this.x;
    }
    public TypeOBJ setType(TypeOBJ type1){
        this.type1 = type1;
        return this.type1;
    }

    public Place getPlace(){
        return this.place;
    }
    @Override
    public void status() {
        System.out.println("Обьект " + this.name + " неподвижен");
    }
    public void getCord() {
        System.out.println(this.name + ", координаты X: " + this.x + " | Y: " + this.y);
    }
}