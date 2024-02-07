package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {

        int i = 0;
        int j = array.length - 1;
        int[] newArray = new int[0];
        while (i < array.length) {
            if (array.length >= 2) {
                if (array[i] + array[j] == target) {
                    newArray = new int[]{i, j};
                    break;
                }
                if (array[i] + array[j] > target) {
                    j--;
                    if (array[i] + array[j] == target) {
                        newArray = new int[]{i, j};
                        break;
                    }
                }
            }
            i++;
        }
        return newArray;
    }
}