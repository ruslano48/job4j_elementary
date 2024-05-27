package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || isPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("isEven(4): " + isEven(4));
        System.out.println("isPositive(4): " + isPositive(4));
        System.out.println("notEven(4): " + notEven(4));
        System.out.println("notPositive(4): " + notPositive(4));
        System.out.println("notEvenAndPositive(4): " + notEvenAndPositive(4));
        System.out.println("evenOrNotPositive(4): " + evenOrNotPositive(4));

        System.out.println("isEven(-3): " + isEven(-3));
        System.out.println("isPositive(-3): " + isPositive(-3));
        System.out.println("notEven(-3): " + notEven(-3));
        System.out.println("notPositive(-3): " + notPositive(-3));
        System.out.println("notEvenAndPositive(-3): " + notEvenAndPositive(-3));
        System.out.println("evenOrNotPositive(-3): " + evenOrNotPositive(-3));
    }
}
