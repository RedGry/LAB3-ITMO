package com.company;

import java.util.Objects;

abstract class AHuman implements IHuman {
    protected Feelings Feel;
    protected double x;
    protected double y;
    protected Gender gender;
    protected String name;
    protected HandType type;
    protected Place place;

    @Override
    public HandType getHandType() {
        return this.type;
    }

    @Override
    public double getX(){
        return this.x;
    }
    @Override
    public double getY(){
        return this.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AHuman aHuman = (AHuman) o;
        return Objects.equals(name, aHuman.name) &&
                type == aHuman.type &&
                Objects.equals(x, aHuman.x) &&
                Objects.equals(y, aHuman.y);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", place='" + place + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", gender=" + gender +
                '}';
    }

    public String getName(){
        return this.name;
    }

    public Place setPlace(Place place) {
        this.place = place;
        this.x = place.getX();
        this.y = place.getY();
        return this.place;
    }

    public double setX(double x){
        this.x = x;
        return x;
    }

    public double setY(double y){
        this.y = y;
        return y;
    }

    @Override
    public void run(Place place) {
        System.out.println(this.name +" бежит в место " + place.getName());
    }

    public Feelings setFeel(Feelings f) {
        this.Feel = f;
        return this.Feel;
    }

    public String Type(HandType type) {
        String _HandType;
        switch (type){
            case PODGY:
                _HandType = " пухленькими ручками";
                break;
            case SMALL:
                _HandType = " маленькими ручками";
                break;
            case LONG:
                _HandType = " длинными ручкками";
                break;
            case THIN:
                _HandType = " тонкими ручкками";
                break;
            case NORMAL:
                _HandType = " обычными ручкками";
                break;
            default:
                _HandType = " ручками";
                break;
        }
        return (_HandType);
    }
}