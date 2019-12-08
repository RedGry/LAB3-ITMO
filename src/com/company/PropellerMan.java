package com.company;

public class PropellerMan extends Human {
    private Button TypeButton = Button.OFF;

    PropellerMan(String name, Gender gender, HandType type, double x, double y) {
        super(name, gender, type, x, y);
    }

    PropellerMan(String name, Gender gender) {
        super(name, gender);
    }

    PropellerMan(String name, Gender gender, double x, double y) {
        super(name, gender, x, y);
    }

    public void PushButton(){
        Actions.PlusCountActions();
            if (Feel == Feelings.EXCESS) {
                System.out.println('\n' + "От избытка чувств " + name + " нажал кнопку на животе.");
                TypeButton = Button.ON;
            } else {
                System.out.println('\n' + name + " нажал" + this.gender.getGenderCase() + " кнопку на животе.");
                TypeButton = Button.ON;
        }
    }

    public void fly() {
        Actions.PlusCountActions();
        if (TypeButton == Button.ON) {
            System.out.println('\n' + name + " взмыл вверх.");
            x = Math.random() * 10;
            y = Math.random() * 10;
            System.out.println(name + " приземлился.");
        }
        else if (TypeButton == Button.OFF){
            System.out.println('\n' + name + " не нажал ещё на кнопку!\n" + name + " решил нажать на кнопку и взлететь.");
            PushButton();
            fly();
        }
    }

    public void FlyObj(obj o){
        Actions.PlusCountActions();
        if (name == "Карлсон" && TypeButton == Button.ON) {
            if (Feel != null){
                System.out.println('\n' + name + " взмыл вверх с " + this.Feel.getFeel() + " воплями.");
            }
            else {
                System.out.println('\n' + name + " взмыл вверх.");
            }
            System.out.println(name + " сделал несколько кругов вокруг обьекта " + o.getName() + ".");
            x = Math.random() * 10;
            y = Math.random() * 10;
            int random = (int) (Math.random()*3);
            if (random == 2) {
                System.out.print(name + " упал т.к. случайно задел кнопку на животе");
                return;
            }
            System.out.println(name + " приземлился");
        }
        else if (TypeButton == Button.OFF){
            System.out.println('\n' + name + " не нажал ещё на кнопку!\n" + name + " решил нажать на кнопку и взлететь.");
            PushButton();
            FlyObj(o);
        }
    }
}
