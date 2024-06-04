package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен:" + ages.length);
        System.out.println("Размер массива равен:" + surnames.length);
        System.out.println("Размер массива равен:" + prices.length);

        String[] names = new String[5];
        names[0] = "Иван Иванов";
        names[1] = "Петр Петров";
        names[2] = "Акакий Зелепукин";
        names[3] = "Даздраперма Владленова";
        names[4] = "Оюшминальда Первомаева";
        System.out.println("Name:" + names[0]);
        System.out.println("Name:" + names[1]);
        System.out.println("Name:" + names[2]);
        System.out.println("Name:" + names[3]);
        System.out.println("Name:" + names[4]);
    }
}