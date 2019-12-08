package com.company;

import static com.company.HandType.NORMAL;

public class Human extends AHuman {
    private String places;
    private String ending;

    Human(String name,Gender gender, HandType type, double x, double y) {
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
        this.gender = gender;
        if (gender.equals(Gender.FEMALE)){
            ending = "ла";
        }
        else ending = "л";
        System.out.println("Персонаж " + this.name + " создан с" + Type(this.type) + ".");
    }

    Human(String name, Gender gender) {
        this.name = name;
        x = 0.0;
        y = 0.0;
        this.gender = gender;
        type = NORMAL;
        if (gender.equals(Gender.FEMALE)){
            ending = "ла";
        }
        else ending = "л";
        System.out.println("Персонаж " + this.name + " создан.");
    }

    Human(String name, Gender gender, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
        this.gender = gender;
        type = NORMAL;
        if (gender.equals(Gender.FEMALE)){
            ending = "ла";
        }
        else ending = "л";
        System.out.println("Персонаж " + this.name + " создан.");
    }


    public void look() {
        System.out.println('\n'+ name + " смотрит по сторонам!");
        Actions.PlusCountActions();
    }


    public void jump(obj o) {
        Actions.PlusCountActions();
        places = o.getName();
        x = o.getX();
        y = o.getY();
        System.out.println('\n'+ name + " бросил" + this.gender.getGenderCase() + "ся на место: " + places + ".");
        System.out.println("Словно коршун на добычу.");
    }

    public void Compress(obj o) {
        Actions.PlusCountActions();
        o.setType(TypeOBJ.COMPRESSED);
        System.out.println('\n'+ name +" жадно сжимает " + o.getName() + Type(type) + ".");
        System.out.println(o.getName() + " сдавлен!");
    }

    public void put(obj o, Place place, double x, double y){
        Actions.PlusCountActions();
        this.place = place;
        this.x = x;
        this.y = y;
        System.out.println('\n'+ name + " положил" + this.gender.getGenderCase() + " " + o.getName()+ ".");
    }

    public void disappeared(Place p){
        Actions.PlusCountActions();
        if (p.getName().equals("Неизвестно")) {
            x = p.getX();
            y = p.getY();
            System.out.println('\n' + name + "иcчез" + this.gender.getGenderCase() + " в " + p.getName() + " месте.");
        }
        else System.out.println('\n' + name + " пропал безвести.");
    }

    public void run(Place place) {
        Actions.PlusCountActions();
        this.place = place;
        this.x = place.x;
        this.y = place.y;
        System.out.println('\n'+ name + " побежал" + this.gender.getGenderCase() + " на место " + place.getName() + ".");

    }

    void take(obj o){
        Actions.PlusCountActions();
        if (this.place.getName().equals(o.place.getName())){
                System.out.println("\n" + name + " взял" + this.gender.getGenderCase() + " " + o.getName() + ".");
        }
        else System.out.println("Обькт находится в другом месте.");
    }

    public void Throw(obj o){
        Actions.PlusCountActions();
        o.setX(Math.random()*10);
        o.setY(Math.random()*10);
        System.out.println('\n'+ name + " кинул" + this.gender.getGenderCase() + " " + o.getName() + ".");
    }

    public void getCord() {
        System.out.println('\n' + this.name +" координата X: " + this.x + " | Y: " + this.y + ".");
    }


    public void thinking (Human h, String s){
        Actions.PlusCountActions();
        System.out.println('\n' + name + " размышляет о персонаже: " + h.getName());
        System.out.println(s);
    }


    public void flap(){
        Actions.PlusCountActions();
        System.out.println('\n' + name + " решил" + this.gender.getGenderCase() + " махнуть на всё рукой.");
    }


    public void disappeared(obj o){
        Actions.PlusCountActions();
        place = o.getPlace();
        places = o.getName();
        x = o.getX();
        y = o.getY();
        System.out.println('\n' + name + " иcчез" + this.gender.getGenderCase() + " под обьектом " + places + ".");
    }

    public void heard (Human h){
        Actions.PlusCountActions();
        h.setFeel(Feelings.RUSH);
        System.out.println("\n" + name + " услышал персонажа " + h.getName() + ".");
    }

    public void heard (){
        System.out.println("\n" + name + " услышал что-то.");
    }

    public void SwayHead(){
        Actions.PlusCountActions();
        if (gender == Gender.FEMALE){
            ending = "ла";
        }
        else ending = "л";
        switch (Feel){
            case DISAPPROVINGLY:
                System.out.println("\n" + name + " неодобрительно покача" + ending + " головой.");
                break;
            case ANGRY:
                System.out.println("\n" + name + " злобно покача" + ending + " головой.");
                break;
             case ANGER:
                System.out.println("\n" + name + " гневно покача" + ending + " головой.");
                break;
            case RUSH:
                System.out.println("\n" + name + " торопливо покача" + ending + " головой.");
                break;
            case GLADNESS:
                System.out.println("\n" + name + " радостно покача" + ending + " головой.");
                break;
            default:
                System.out.println("\n" + name + " покача" + ending + " головой.");
                break;
        }
    }

    public void cut(obj o){
        Actions.PlusCountActions();
        if (o.place.equals(place)){
            System.out.println("\n" + name + " может разрезать обькет " + o.getName() + ".");
        }
        else {
            System.out.println("\n" + name + " не может разрезать обьект " + o.getName() +" т.к. нож находится в другом месте.");
            this.Feel = Feelings.DISAPPROVINGLY;
            SwayHead();
        }
    }

    public void thinking (Human h){
        Actions.PlusCountActions();
        System.out.println('\n' + name + " размышляет о песонаже: " + h.getName());
        System.out.println("\t >Хм... А чем бы нам заняться?");
    }

    public void walk(Place place){
        this.place = place;
        Actions.PlusCountActions();
        System.out.println("\n" + name + " идет в место " + place.getName() + ".");
    }

    public static class Actions {
        public static int Count = 0;
        protected static void PlusCountActions(){
            Count += 1;
        }

        public static int getCount() {
            return Count;
        }
    }

    public void search(obj o){
        System.out.println("\n" + name + " ищет обьект " + o.getName() + " в " + place.getName());
        if (place.equals(o.getPlace())){
            System.out.println("\n" + name + " нашёл" + ending + " обьект " + o.getName());
            take(o);
        }
        else {
            System.out.print("\n" + name + " не смог" + ending + " отыскать обькт " + o.getName() + "\n");
            System.out.print(name + " предполагает, что обьект " + o.getName() + " находится в месте " + o.place.getName());
            run(o.place);
            take(o);
        }
    }
}

