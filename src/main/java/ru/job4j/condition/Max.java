package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] agrs) {
        int a = 10;
        int b = 5;
        int maxResult = max(a, b);
        System.out.println("The maximum of " + a + " and " + b + " is " + maxResult);
    }
}
