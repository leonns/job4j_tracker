package ru.job4j.oop;

public class Builder extends Engineer {
    private boolean hasHelmet;

    public Builder(String name, String surname, String education, String birthday, int experience, boolean hasHelmet) {
        super(name, surname, education, birthday, experience);
        this.hasHelmet = hasHelmet;
    }

    public boolean isHelmet() {
        return hasHelmet;
    }
}
