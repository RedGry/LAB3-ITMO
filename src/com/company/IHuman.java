package com.company;

public interface IHuman {
    void run(Place place);
    String getName();
    double getX();
    double getY();
    double setX(double x);
    double setY(double y);
    HandType getHandType();
}
