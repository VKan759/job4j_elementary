package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double diffX = x2 - x1;
        double diffY = y2 - y1;
        double powX = Math.pow(diffX, 2);
        double powY = Math.pow(diffY, 2);
        double sum = powX + powY;
        double result = Math.sqrt(sum);
    return result;
}

    public static void main(String[] args) {
        double result = Point.distance(1, 3, 7, 12);
        System.out.println("result (1, 3) to (7, 12) " + result);

    }
}
