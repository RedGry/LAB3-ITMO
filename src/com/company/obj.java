package com.company;

public class obj extends AOBJ {
    private String name;

    obj(String name , Place place){
        this.name = name;
        x = 0;
        y = 0;
        this.place = place;
        type1 = TypeOBJ.NORMAL;
    }
    obj(String name, TypeOBJ type , Place place){
        this.name = name;
        x = 0;
        y = 0;
        this.place = place;
        type1 = type;
    }

    obj(String name, TypeOBJ type, Place place, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
        this.place = place;
        type1 = type;
    }

    obj(String name, double x, double y , Place place){
        this.name = name;
        this.x = x;
        this.y = y;
        this.place = place;
        type1 = TypeOBJ.NORMAL;
    }

    public String getName(){
        return name;
    }

    public void getType(){
        if (type1 == TypeOBJ.NORMAL){
            System.out.println( getName() + " нормальный.");
        }
        else if (type1 == TypeOBJ.BEAUTIFUL){
            System.out.println( getName() + " замечательный.");
        }
        else if (type1 == TypeOBJ.COMPRESSED){
            System.out.println( getName() + " сдавленный.");
        }
        else if (name == "Персик"){
            if(type1 == TypeOBJ.ROTTEN){
                System.out.println( getName() + " гнилой.");
            }
        }
    }

    @Override
    public String toString() {
        return "OBJ{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
