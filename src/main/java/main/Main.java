package main;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.print(binarySearch(new int[]{1, 2, 3, 4, 5}, 1, 5, 5));
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

    public static boolean isPalindrome(String in) {
        boolean result = true;
        int length = in.length();
        for (int i = 0; i < length / 2; i++) {
            if (in.charAt(i) != in.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static String removeWhitespace(String in) {
        StringBuilder out = new StringBuilder();
        char[] charArray = in.toCharArray();
        for (char c : charArray) {
            if (!Character.isWhitespace(c)) {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static long factorial(long n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (n * factorial(n - 1));
        }
    }

    public static void reverseLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        LinkedList<Integer> newList = new LinkedList<>();
        list.descendingIterator().forEachRemaining(newList::add);
        System.out.println(newList);
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            }
            else if (arr[mid] == key) {
                return mid;
            }
            else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            return -1;
        }
        return -1;
    }
}