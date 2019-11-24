package com.company;

public class Main {
    public static void main(String[] args) {
        // Создаем место
        double MAX_1 = 10.0;
        double MIN_1 = 0.0;
        double MAX_2 = 20.0;
        double MIN_2 = 10.0;
        Place Room_Malish = new Place("Комната Малыша", MAX_1, MAX_1);
        Place Kitchen = new Place("Кухня", MAX_2, MAX_2);

        // Создаем персонажей и обьекты, указание места
        obj lamp = new obj ("Лампа", Room_Malish);
        obj peach = new obj("Персик", TypeOBJ.BEAUTIFUL, Kitchen);
        obj knife = new obj("Нож", 15, 17, Kitchen);
        obj Table = new obj("Стол",9, 5, Room_Malish);
        Human mama = new Human("Мама", Gender.FEMALE, Kitchen.getX(), Kitchen.getY());
        Human karlson = new Human("Карлсон", Gender.MALE, HandType.PODGY, 0,0);
        Human malish = new Human("Малыш", Gender.MALE, HandType.SMALL, 0, 0);
        mama.setPlace(Kitchen);
        karlson.setPlace(Room_Malish);
        malish.setPlace(Room_Malish);
        System.out.println("============================================");

        //Указываем действия персонажам
        karlson.setFeel(Feelings.EXCESS);
        karlson.PushButton();
        karlson.setFeel(Feelings.GLADNESS);
        karlson.fly(lamp);
        malish.fly();
        malish.flap();
        malish.thinking(karlson, "\t >Ведь Карлсон на самом деле вовсе не был шпионом -- значит, его могут задержать только за то, что он Карлсон. \n\t >Наверное мама и папа испугались не за Карлсона, а за свой покой.\n\t >Они просто боялись, что если все будут ловить Карлсона, то скрывать его существование уже не удастся.");
        mama.take(peach);
        mama.walk(Room_Malish);
        try {
            mama.put(peach, Room_Malish, peach.setX(2.0),peach.setY(5.0));
            if (peach.getX() > MAX_1 || peach.getY() > MAX_1 || peach.getX() < MIN_1 || peach.getY() < MIN_1){
                System.out.println("Вы вышли за территорию данного места!");
                peach.setX((Math.random()*(MAX_1 + 1)));
                peach.setY((Math.random()*(MAX_1 + 1)));
            }
        } catch (Exception e) {
            System.out.println("Вы вышли за территорию данного места и не можете положить обьект сюда!");
        }
        karlson.look();
        karlson.jump(peach);
        karlson.Compress(peach);
        karlson.cut(peach);
        karlson.SwayHead();

        // Изменение место положение + действие
        malish.run(Kitchen);
        malish.take(knife);
        karlson.disappeared(Table);
        malish.run(Room_Malish);

        //Указываем действия персонажам
        malish.heard(karlson);

        //Пасхалка
        try {
            System.out.println("\n============================================");
            System.out.println();
            Teachers gg = new Teachers(args[0], Gender.MALE);
            gg.say();
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.exit(0);
        }

    }
}
