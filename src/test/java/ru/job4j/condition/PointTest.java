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
    void when7Minus8And9toMinus6And9And4Then21Dot98() {
        double expected = 21.98;
        Point a = new Point(7, -8, 9);
        Point b = new Point(-6, 9, 4);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus2And2And7To3And0And5Then5Dot74() {
        double expected = 5.74;
        Point a = new Point(-2, 2, 7);
        Point b = new Point(3, 0, 5);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when338to088Then6Dot56() {
        double expected = 6.56;
        Point a = new Point(3, 3, 5);
        Point b = new Point(0, 8, 8);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}