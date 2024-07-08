package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += symbol + (counter > 1 ? Integer.toString(counter) : "");
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result += symbol + (counter > 1 ? Integer.toString(counter) : "");

        return result;
    }
}