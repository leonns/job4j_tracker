package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance1() {
        double expected = 5.0;
        Point a = new Point(1, 4);
        Point b = new Point(1, 9);
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);

    }

    @Test
    public void distance2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0,2);
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);

    }
}