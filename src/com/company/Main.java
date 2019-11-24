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

        Author Author = new Author("Астрид Линдгрен", Gender.FEMALE);

        Human Mom = new Human("Мама", Gender.FEMALE, Kitchen.getX(), Kitchen.getY());
        Human Karlson = new Human("Карлсон", Gender.MALE, HandType.PODGY, 0,0);
        Human Malish = new Human("Малыш", Gender.MALE, HandType.SMALL, 0, 0);

        Mom.setPlace(Kitchen);
        Karlson.setPlace(Room_Malish);
        Malish.setPlace(Room_Malish);
        System.out.println("============================================");

        //Указываем действия персонажам
        Karlson.setFeel(Feelings.EXCESS);
        Karlson.PushButton();
        Karlson.setFeel(Feelings.GLADNESS);
        Karlson.fly(lamp);
        Malish.flap();
        Malish.thinking(Karlson, "\t >Ведь Карлсон на самом деле вовсе не был шпионом -- значит, его могут задержать только за то, что он Карлсон. " +
                                    "\n\t >Наверное мама и папа испугались не за Карлсона, а за свой покой." +
                                    "\n\t >Они просто боялись, что если все будут ловить Карлсона, то скрывать его существование уже не удастся.");
        Mom.take(peach);
        Mom.walk(Room_Malish);
        try {
            Mom.put(peach, Room_Malish, peach.setX(2.0),peach.setY(5.0));
            if (peach.getX() > MAX_1 || peach.getY() > MAX_1 || peach.getX() < MIN_1 || peach.getY() < MIN_1){
                System.out.println("Вы вышли за территорию данного места!");
                peach.setX((Math.random()*(MAX_1 + 1)));
                peach.setY((Math.random()*(MAX_1 + 1)));
            }
        } catch (Exception e) {
            System.out.println("Вы вышли за территорию данного места и не можете положить обьект сюда!");
        }

        Author.speak("Они снова стояли рядом посреди комнаты Малыша");
        Karlson.look();
        Karlson.jump(peach);
        Author.speak("Словно коршун на добычу.");
        Karlson.Compress(peach);
        Karlson.cut(peach);
        Karlson.SwayHead();

        // Изменение место положение + действие
        Author.speak("Чтобы разделить персик, нужен был нож:, и Малыш побежал в кухню.");
        Malish.run(Kitchen);
        Malish.take(knife);
        Karlson.disappeared(Table);
        Malish.run(Room_Malish);

        //Указываем действия персонажам
        Malish.heard(Karlson);
        Author.speak("Из под стола доносилось чавканье и причмокивание, словно кто-то торопливо ел что-то очень сочное.");

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
