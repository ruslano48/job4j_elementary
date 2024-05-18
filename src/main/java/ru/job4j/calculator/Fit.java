package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manheight) {
        double result = manheight * 1.15;
        return result;
    }

    public static double womanWeight(short womanheight) {
        double result = womanheight * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short menheight = 100;
        short womanheight = 110;
        double man = manWeight(menheight);
        double woman = womanWeight(womanheight);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 110 is " + woman);
    }
}
