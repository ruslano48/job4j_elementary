package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        if (prefix.length > word.length) {
            return false;
        }

        for (int i = 0; i < prefix.length; i++) {
            if (word[i] != prefix[i]) {
                return false;
            }
        }
        return true;
    }
}

