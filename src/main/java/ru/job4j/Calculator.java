package ru.job4j;

public class Calculator {

    public static void main(String[] agrs) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int onePlusTwo = one + two;
        int onePlusFive = one + five;
        System.out.println(onePlusFive);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        System.out.println(onePlusTwo);
    }

}

class ArgumentsMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);

    }
}
