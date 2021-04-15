package ru.job4j.oop;

public class Programmer extends Engineer {

    private boolean hacCar;

    public Programmer(String name, String surname, String education, String birthday, int experience, boolean hacCar) {
        super(name, surname, education, birthday, experience);
        this.hacCar = hacCar;
    }

    public boolean isCar() {
        return hacCar;
    }
}
