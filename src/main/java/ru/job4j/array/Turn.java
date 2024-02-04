package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int lastIndex = array.length - i - 1;
            int temp = array[lastIndex];
            array[lastIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
