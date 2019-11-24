package com.company;

public enum Gender {
    MALE("МУЖСКОЙ", ""),   // Мужчина
    SHEMALE("НЕИЗВЕСТНО", ""),// Транссексуал
    FEMALE("ЖЕНСКИЙ", "а"); // Женщина

    private String gender;
    private String genderCase;

    Gender(String gender, String genderCase) {
        this.gender = gender;
        this.genderCase = genderCase;
    }

    public String getGender() {
        return gender;
    }

    public String getGenderCase() {
        return genderCase;
    }
}
