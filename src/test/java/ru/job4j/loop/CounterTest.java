package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0And5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when11And2Then0() {
        int start = 11;
        int finish = 2;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumByEvenWhen0And9Then20() {
    int start = 0;
    int finish = 9;
    int output = Counter.sumByEven(start, finish);
    int expected = 20;
    assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumByEvenWhenMinus3And5Then4() {
        int start = -3;
        int finish = 5;
        int output = Counter.sumByEven(start, finish);
        int expected = 4;
        assertThat(output).isEqualTo(expected);
    }
}