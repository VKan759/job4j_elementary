package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int i;
        int j = 0;
        int counter = 1;
        result = result + symbol;

        for (i = 1; i < input.length(); i++) {
            if (counter > 1 && input.charAt(i) != input.charAt(j)) {
                result = result + counter;
                counter = 1;
            }
            if (input.charAt(i) != input.charAt(j)) {
                result = result + input.charAt(i);
            } else {
                counter++;
            }
            j++;
        }
        if (counter > 1) {
            return result + counter;
        }
        return result;
    }
}
