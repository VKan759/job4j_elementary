package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first <= second && second > third) {
            result = second;
        } else if (first < second && second >= third) {
            result = second;
        } else if (third >= first && second < third) {
            result = third;
        }
        return result;
    }
}
