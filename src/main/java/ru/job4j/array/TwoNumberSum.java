package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {

        int i = 0;
        int j = array.length - 1;
        int[] newArray = new int[0];
        while (i < array.length && array.length >= 2 && i != j) {
            if (array[i] + array[j] == target) {
                newArray = new int[]{i, j};
                break;
            } else if (array[i] + array[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return newArray;
    }
}