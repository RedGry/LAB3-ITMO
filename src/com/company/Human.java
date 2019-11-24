package com.company;

import static com.company.HandType.NORMAL;

public class Human extends AHuman {
    private String places;
    private Button TypeButton = Button.OFF;
    private String ending;

    Human(String name,Gender gender, HandType type, double x, double y) {
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
        this.gender = gender;
        System.out.println("Персонаж " + this.name + " создан с" + Type(this.type) + ".");
    }

    Human(String name, Gender gender) {
        this.name = name;
        x = 0.0;
        y = 0.0;
        this.gender = gender;
        type = NORMAL;
        System.out.println("Персонаж " + this.name + " создан.");
    }

    Human(String name, Gender gender, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
        this.gender = gender;
        type = NORMAL;
        System.out.println("Персонаж " + this.name + " создан.");
    }


    public void look() {
        System.out.println('\n'+ name + " смотрит по сторонам!");
    }


    private String Type(HandType type) {
        String _HandType;
        switch (type){
            case PODGY:
                _HandType = " пухленькими ручками.";
                break;
            case SMALL:
                 _HandType = " маленькими ручками.";
                 break;
            case LONG:
                _HandType = " длинными ручкками.";
                break;
            case THIN:
                _HandType = " тонкими ручкками.";
                break;
            case NORMAL:
                _HandType = " обычными ручкками.";
                 break;
            default:
                _HandType = " ручками.";
                break;
        }
        return (_HandType);
    }

    public void jump(obj o) {
        places = o.getName();
        x = o.getX();
        y = o.getY();
        if (this.gender == Gender.FEMALE){
            System.out.println('\n'+ name + " бросилась на место: " + places + ".");
        }
        else if (gender == Gender.MALE | gender == Gender.SHEMALE) {
            System.out.println('\n'+ name + " бросился на место: " + places + ".");
        }
        if (name.equals("Карлсон") && o.getName().equals("Персик")){
            System.out.println("Словно коршун на добычу.");
        }
    }

    public void jump(Place place) {
        x = place.getX();
        y = place.getY();
        if (gender == Gender.FEMALE){
            System.out.println('\n'+ name + " бросилась на место: " + place.getName() + ".");
        }
        else if (gender.equals(Gender.MALE) | gender.equals(Gender.SHEMALE)) {
            System.out.println('\n'+ name + " бросился на место: " + place.getName() + ".");
        }
    }

    public void Compress(obj o) {
        o.setType(TypeOBJ.COMPRESSED);
        System.out.println('\n'+ name +" жадно сжимает " + o.getName() + Type(type) + ".");
        System.out.println(o.getName() + " сдавлен!");
    }

    public void put(obj o, Place place, double x, double y){
        this.place = place;
        this.x = x;
        this.y = y;
        if (gender == Gender.FEMALE) {
            System.out.println('\n'+ name + " положила " + o.getName() + ".");
        }
        else System.out.println('\n'+ name + " положил " + o.getName()+ ".");
    }

    public void run(double x, double y) {
        this.x = x;
        this.y = y;
        if (gender == Gender.MALE | gender == Gender.SHEMALE){
            System.out.println('\n'+ name + " побежал на место X: "+ setX(this.x) + " | Y: "+ setY(this.y) + ".");
        }
        else
            System.out.println('\n'+ name + " побежала на место X: "+ setX(this.x)+ " | Y: "+ setY(this.y) + ".");
    }

    public void run(Place place) {
        this.place = place;
        this.x = place.x;
        this.y = place.y;
        if (this.gender == Gender.MALE | this.gender == Gender.SHEMALE){
            System.out.println('\n'+ name + " побежал на метсо " + place.getName() + ".");
        }
        else
            System.out.println('\n'+ name + " побежала на метсо " + place.getName() + ".");
    }

    void take(obj o){
        if (this.place.getName().equals(o.place.getName())){
            if (this.gender == Gender.FEMALE) {
                System.out.println("\n" + name + " взяла " + o.getName() + ".");
            } else System.out.println("\n" + name + " взял " + o.getName() + ".");
        }
        else System.out.println("Обькт находится в другом месте.");
    }

    public void Throw(obj o){
        o.setX(Math.random()*10);
        o.setY(Math.random()*10);
        if (this.gender == Gender.FEMALE) {
            System.out.println('\n'+ name + " кинула " + o.getName() + ".");
        }
        else System.out.println('\n'+ name + " кинул " + o.getName() + ".");
    }

    public void getCord() {
        System.out.println('\n' + this.name +" координата X: " + this.x + " | Y: " + this.y + ".");
    }


    public void fly() {
        if (name == "Карлсон" && TypeButton == Button.ON) {
            System.out.println('\n' + name + " взмыл вверх.");
            x = Math.random() * 10;
            y = Math.random() * 10;
            System.out.println(name + " приземлился.");
        }
        else if (this.name == "Карлсон" && TypeButton == Button.OFF){
            System.out.println('\n' + name + " не может взлететь т.к. кнопка на животе не нажата!");
        }
        else System.out.println('\n' + "У персонажа " + name + " нет данной способности.");
    }

    public void fly(obj o){
        if (name == "Карлсон" && TypeButton == Button.ON) {
            if (Feel == Feelings.GLADNESS){
                System.out.println('\n' + name + " взмыл вверх с радостными воплями.");
            }
            else {
                System.out.println('\n' + name + " взмыл вверх.");
            }
            System.out.println(name + " сделал несколько кругов вокруг обьекта " + o.getName() + ".");
            x = Math.random() * 10;
            y = Math.random() * 10;
            System.out.println(name + " приземлился");
        }
        else if (name == "Карлсон" && TypeButton == Button.OFF){
            System.out.println('\n' + name + " не может взлететь т.к. кнопка не нажата!");
        }
        else System.out.println('\n' + "У персонажа " + name + " нет данной способности.");
    }

    public void PushButton(){
        if (name == "Карлсон") {
            if (Feel == Feelings.EXCESS) {
                System.out.println('\n' + "От избытка чувтсв " + name + " нажал кнопку на животе.");
                TypeButton = Button.ON;
            } else {
                System.out.println('\n' + name + " нажал кнопку на животе.");
                TypeButton = Button.ON;
            }
        }
        else {
            if (gender == Gender.FEMALE){
            System.out.println("\n" + "Карлсон, не хочет, чтобы персонаж " + name + " нажимала на его кнопку.");
            }
            else System.out.println("\n" + "Карлсон, не хочет, чтобы персонаж " + name + " нажимал на его кнопку.");
        }
    }

    public void thinking (Human h, String s){
            System.out.println('\n' + name + " размышляет о персонаже: " + h.getName());
            System.out.println(s);
    }


    public void thinking (Human h){
            System.out.println('\n' + name + " размышляет о песонаже: " + h.getName());
            System.out.println("\t >Хм... А чем бы нам заняться?");
        }

    public void flap(){
        System.out.println('\n' + name + " решил махнуть на всё рукой.");
    }

    public void disappeared(Place p){
        if (p.getName().equals("Неизвестно")) {
            x = p.getX();
            y = p.getY();
            System.out.println('\n' + name + " пропал в " + p.getName() + " месте.");
        }
        else System.out.println('\n' + name + " пропал безвести.");
    }

    public void disappeared(obj o){
        place = o.getPlace();
        places = o.getName();
        x = o.getX();
        y = o.getY();
        System.out.println('\n' + name + " исчез под обьектом " + places + ".");
        if (name.equals("Карлсон")){
            Feel = Feelings.RUSH;
        }
    }

    public void heard (Human h){
        System.out.println("\n" + name + " услышал персонажа " + h.getName() + ".");
        if (h.places.equals("Стол") && h.Feel.equals(Feelings.RUSH)) {
            System.out.println("Из под стола доносилось чавканье и причмокивание, словно кто-то торопливо ел что-то очень сочное.");
        }
    }

    public void heard (){
        System.out.println("\n" + name + " услышал что-то.");
    }

    public void SwayHead(){
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
        if (o.place.equals(place)){
            System.out.println("\n" + name + " может разрезать обькет " + o.getName() + ".");
        }
        else {
            System.out.println("\n" + name + " не может разрезать обькт " + o.getName() +" т.к. нож находится в другом месте.");
            this.Feel = Feelings.DISAPPROVINGLY;
        }
    }

    public void walk(Place place){
        this.place = place;
        System.out.println("\n" + name + " идет в место " + place.getName() + ".");
    }
}

