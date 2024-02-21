package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax2To1Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then1() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1IsEqual2Then1() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when123Then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when020Then2() {
        int a = 0;
        int b = 2;
        int c = 0;
        int result = Max.max(a, b, c);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when111Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int result = Max.max(a, b, c);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when4567Then7() {
        int a = 4;
        int b = 5;
        int c = 6;
        int d = 7;
        int result = Max.max(a, b, c, d);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when0201Then2() {
        int a = 0;
        int b = 2;
        int c = 0;
        int d = 1;
        int result = Max.max(a, b, c, d);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when4444Then4() {
        int a = 4;
        int b = 4;
        int c = 4;
        int d = 4;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}