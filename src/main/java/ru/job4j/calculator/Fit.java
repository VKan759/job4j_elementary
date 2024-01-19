package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = 1.15 * (height - 100);
        return result;
    }

    public static double womanWeight(short height) {
        double result = 1.15 * (height - 110);
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
