package main;

public class Main {

    public static void main(String[] args) {
        String string = "123";
        System.out.println(reverse(string));
    }

    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        StringBuilder output = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            output.append(chars[i]);
        }
        return output.toString();
    }
}