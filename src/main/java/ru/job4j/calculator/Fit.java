package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manheight) {
        double result = manheight - 100 * 1.15;
        return result;
    }

    public static double womanWeight(short womanheight) {
        double result = womanheight - 110 * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short menheight = 182;
        short womanheight = 172;
        double man = manWeight(menheight);
        double woman = womanWeight(womanheight);
        System.out.println("Man 182 is " + man);
        System.out.println("Woman 172 is " + woman);
    }
}
