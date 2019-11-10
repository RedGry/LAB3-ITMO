package com.company;

public class Coordinates {
    public String name;
    public Double x;
    public Double y;

    public Coordinates(double _x, double _y){
        x = _x;
        y = _y;
        name = x.toString() + " / " + y.toString();
    }

    public Coordinates(double _x, double _y, String _name){
        x = _x;
        y = _y;
        name = _name;
    }

    public Double getX(){ return x;}
    public Double getY(){ return y;}

    public String getName(){ return name;}

    public double[] getCooridanetes(){
        double[] coord = {x,y};
        return coord;
    }
}
