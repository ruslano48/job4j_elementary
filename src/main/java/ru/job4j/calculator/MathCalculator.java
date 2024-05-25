package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {

        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDiv(double first, double second) {
        return minus(second, first)
                + div(second, first);
    }

    public static double sumMethod(double first, double second) {

        return sumAndMultiply(first, second) + minusAndDiv(first, second);
    }

    public static void main(String[] args) {
        double first = 10;
        double second = 20;
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(first, second));
        System.out.println("Результат расчета minusAndDiv равен: " + minusAndDiv(first, second));
        System.out.println("Результат расчета sumMethod равен: " + sumMethod(first, second));
    }
}