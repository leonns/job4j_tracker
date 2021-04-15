package ru.job4j.oop;

public class Dentist extends Doctor {
    private int experience;

    public Dentist(String name, String surname, String education, String birthday, int age, int experience) {
        super(name, surname, education, birthday, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
