package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y1 - y2) * (y2 - y1));
        double result = a;
        return result;

    }

    public static void main(String[] agrs) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2,0) " + result);
    }
}



