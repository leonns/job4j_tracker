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

    @Test
    public void distance3d() {
        double expected = 4.48;
        Point a = new Point(0, 0, 4);
        Point b = new Point(0, 4, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}