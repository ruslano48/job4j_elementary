package ru.job4j.condition;

public class TriangleAria {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s1 = p * (p - a) * (p - b) * (p - c);
        double s = Math.sqrt(s1);
        double result = s;
        return result;

    }
    public static void main(String[] agrs) {
     double result = TriangleAria.area(2, 2, 2);
     System.out.println("area (2, 2, 2) = " + result);
    }
}
