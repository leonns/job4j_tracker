package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.maxNumber(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To3Then3() {
        int result = Max.maxNumber(1, 2,3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To4Then4() {
        int result = Max.maxNumber(1, 2,3,4);
        assertThat(result, is(4));
    }
}