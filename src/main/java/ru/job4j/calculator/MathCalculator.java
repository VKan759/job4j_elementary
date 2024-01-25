package ru.job4j.calculator;


import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minAndDivSum(double first, double second) {
        return minus(first, second) + divide(first, second);
    }

    public static double allSum(double first, double second) {
        return sum(first, second) + minus(first, second) + divide(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разницы и деления двух числе равна: " + minAndDivSum(25, 10));
        System.out.println("Сумма всех операций над двуми числами равна: " + allSum(36, 48));
    }
}
