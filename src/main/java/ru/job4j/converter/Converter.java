package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        if (value < 0) {
            System.out.println("Значение не может быть отрицательным");
            return -1;
        }
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        if (value < 0) {
            System.out.println("Значение не может быть отрицательным");
            return -1;
        }
        return value / 60;
    }

    public static void main(String[] args) {

        float input = 140;
        float expected = 2;
        float output = rubleToEuro(input);
        boolean passed = expected == output;

        float inputDollar = 240;
        float expectedDollar = 4;
        float outputDollar = rubleToDollar(inputDollar);
        boolean passedDollar = expectedDollar == outputDollar;

        System.out.println("140 rubles are 2 Euro. Test result: " + passed);
        System.out.println("240 rubles are 4 Dollars. Test result: " + passedDollar);
    }
}
