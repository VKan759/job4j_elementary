package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SquareTest {

    @Test
    void when5Then014916() {
        int bound = 5;
        int[] output = Square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(output).containsExactly(expected);
    }
}