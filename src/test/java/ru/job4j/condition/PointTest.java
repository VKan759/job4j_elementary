package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to22Then1Dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus2and2to30Then5Dot39() {
        double expected = 5.39;
        Point a = new Point(-2, 2);
        Point b = new Point(3, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when35to08Then4Dot24() {
        double expected = 4.24;
        Point a = new Point(3, 5);
        Point b = new Point(0, 8);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when7Minus8toMinus6And9Then21Dot40() {
        double expected = 21.40;
        Point a = new Point(7, -8);
        Point b = new Point(-6, 9);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}