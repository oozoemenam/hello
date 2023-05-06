package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);
        System.out.println(scores);
        scores = sortByValue(scores);
        System.out.println(scores);
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

    public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
        int[] sorted = new int[one.length + two.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < one.length && j < two.length) {
            if (one[i] < two[j]) {
                sorted[k] = one[i];
                k++;
                i++;
            }
            else {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if (i == one.length) {
            while (j < two.length) {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if (j == one.length) {
            while (i < one.length) {
                sorted[k] = one[i];
                k++;
                i++;
            }
        }
        return sorted;
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }
        int mid = (lo + hi) / 2;
        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid + 1, hi);
        int[] merged = mergeTwoSortedArrays(fh, sh);
        return merged;
    }

    public static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }

    public static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            int numberOfWhitespaces = i * 2;
            printString(" ", numberOfWhitespaces);
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static boolean containsSameElements(Object[] array1, Object[] array2) {
        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2));

        if (uniqueElements1.size() != uniqueElements2.size()) return false;

        for (Object obj : uniqueElements1) {
            if (!uniqueElements2.contains(obj)) return false;
        }

        return true;
    }

    public static int sumElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            }
            else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }

    public static void shuffleArray(int[] array) {
        System.out.println(Arrays.toString(array));
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static String formatDate(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
    }

    public static List<String> mergeList(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();
        Set<Entry<String, Integer>> entrySet = scores.entrySet();
        List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        for (Entry<String, Integer> e : entryList) {
            sortedByValue.put(e.getKey(), e.getValue());
        }
        return sortedByValue;
    }
}