package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    @SuppressWarnings("checkstyle:EmptyForIteratorPad")
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;

        int change = money - price;
        int moneyIndex = 0;
        while (change > 0) {
            change = change - coins[moneyIndex];
            size++;
            result[size - 1] = coins[moneyIndex];
            if (change < coins[moneyIndex]) {
            moneyIndex++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}