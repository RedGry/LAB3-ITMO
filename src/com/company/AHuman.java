package com.company;

abstract class AHuman implements IHuman {
    private String name;
    private HandType type;
    private Skills skill;
    private String pName;
    private Coordinates location;
    private Double x;
    private Double y;

    @Override
    public void getName() {
        System.out.println(this.name);
    }

    @Override
    public HandType getHandType() {
        return this.type;
    }
    public void getX(){
        System.out.println(this.x);
    }
    public void getY(){
        System.out.println(this.y);
    }

    @Override
    public void jump(String _name, double _x, double _y ){
        System.out.println(location.getCooridanetes());
    }

    @Override
    public int hashCode() {
        return super.hashCode()+name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode()== this.hashCode() ? true : false;
        return comp;
    }

    @Override
    public void run(Place place) {
        System.out.println(this.name +" бежит");
    }

}
