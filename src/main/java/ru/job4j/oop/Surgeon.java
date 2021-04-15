package ru.job4j.oop;

public class Surgeon extends Doctor {

    private boolean haslicense;

    public Surgeon(String name, String surname, String education, String birthday, int age, boolean haslicense) {
        super(name, surname, education, birthday, age);
        this.haslicense = haslicense;
    }

    public boolean isLicense() {
        return haslicense;
    }
}
