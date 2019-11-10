package com.company;

public class Skills {
    private String name;
    private String info;
    private int mana;


    public Skills(String _name, String _info){
        name = _name;
        info = _info;
        mana = 100;
    }
    public Skills(String _name, String _info, int _mana){
        name = _name;
        info = _info;
        mana = _mana;
    }
    public String getName(){ return name;}
    public int getMana(){ return mana;}
    public String getInfo(){
        if (info == null)
            return "...";
        else
            return info;
    }
}
