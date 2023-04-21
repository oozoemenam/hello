package main;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(onlyOddNumbers(List.of(1, 3, 5)));
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

    public static boolean stringContainsVowels(String in) {
        return in.toLowerCase().matches(".*[aeiou].*");
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= count; i++) {
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}