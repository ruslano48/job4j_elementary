package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {

        int[] array = new int[]{5, 3, 2, 1, 4};

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}