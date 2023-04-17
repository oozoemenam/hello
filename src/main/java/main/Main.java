package main;

public class Main {

    public static void main(String[] args) {
        swapNumbers(5, 7);
    }

    public static String reverse(String in) {
        if (in == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            out.append(chars[i]);
        }
        return out.toString();
    }

    public static void swapNumbers(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + " b: " + b);
    }
}