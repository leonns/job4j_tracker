package ru.job4j.oop;

public class Max {
    public static int maxNumber(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int maxNumber(int first, int second, int third) {
        return maxNumber(first, maxNumber(second, third));
    }

    public static int maxNumber(int first, int second, int third, int fourth) {
        return maxNumber(maxNumber(first, second), maxNumber(third, fourth));
    }
}
