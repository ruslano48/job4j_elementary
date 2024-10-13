package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int middle, int right) {
        return max(max(left, middle), right);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static void main(String[] agrs) {
        int a = 10;
        int b = 5;
        int c = 20;
        int d = 15;
        int maxResult = max(a, b);
        System.out.println("The maximum of " + a + " and " + b + " is " + maxResult);

        int maxResultTwo = max(a, b);
        System.out.println("The maximum of " + a + " and " + b + " is " + maxResultTwo);

        int maxResultThree = max(a, b, c);
        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is " + maxResultThree);

        int maxResultFour = max(a, b, c, d);
        System.out.println("The maximum of " + a + ", " + b + ", " + c + ", and " + d + " is " + maxResultFour);
    }
}
