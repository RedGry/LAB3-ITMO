package com.company;

public class Teachers extends Human {
    private String name;
    private Gender gender;
    private String phrase;
    String[] ListOne = {"Первак", "Студент", "Молодой человек", "Егор", "Группа P3111"};
    String[] ListTwo = {"пишет", "делает", "заходит в", "думает о", "плачет,"};
    String[] ListThree ={"контрольная", "домашнее задание", "хелиос", "ПСЖ", "мальчиках", "ИТМО", "дети"};


    Teachers(String name, Gender gender) {
        super(name, gender);
        this.name = name;
        this.gender = gender;
    }

    public void say(){
        if (name.equals("Балакшин") || name.equals("балакшин")){
            System.out.println(this.name + ": Готовы писать ПСЖ?");
        }
        else if (name.equals("Клименков") || name.equals("клименков")){
            System.out.println(this.name + ": Как вам новая БЭВМ? Сколько сдали уже вторую лабораторную по ОПД?");
        }
        else if (name.equals("Гаврилов") || name.equals("гаврилов")){
            System.out.println(this.name + ": Кто первый сдавать лабораторную?");
        }
        else if (name.equals("Поляков") || name.equals("поляков")){
            System.out.println(this.name + ": И?");
        }
        else if (name.equals("Письмак") || name.equals("письмак")){
            System.out.println(this.name + ": А теперь готовим листочки, у нас контрольная)))");
        }
        else System.out.println(this.name + RandomPhrase());
    }

    public String RandomPhrase(){
        int OneLenght = ListOne.length;
        int TwoLenght = ListTwo.length;
        int ThreeLenght = ListThree.length;

        int rant1 = (int) (Math.random() * OneLenght);
        int rant2 = (int) (Math.random() * TwoLenght);
        int rant3 = (int) (Math.random() * ThreeLenght);
        int a = (int) (Math.random()*5);

        if (a != 2 ) {
            phrase = ": " + ListOne[rant1] + " " + ListTwo[rant2] + " " + ListThree[rant3] + "!";
        }
        else phrase = ": Первый не классический! ИТМО";
        return phrase;
    }


}
