package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    @SuppressWarnings("checkstyle:EmptyForIteratorPad")
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money = money - price;
        int moneyIndex = 0;

        while (money > 0) {
            if (money >= coins[moneyIndex]) {
                money = money - coins[moneyIndex];
                size++;
                result[size - 1] = coins[moneyIndex];
            } else {
                moneyIndex++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}