/*
 * QUESTION:-
 * To create a Java program that finds two numbers in an array whose sum equals a given target value?
 * and find the Big O notation
 * 
 * array-
 *   +-----+-----+-----+-----+-----+-----+-----+
 *   |  0  |  5  |  7  |  9  |  4  |  0  |  2  |
 *   +-----+-----+-----+-----+-----+-----+-----+
 * 
 * target = 10
 * 
 * 
 */

// first method

import java.util.HashSet;
import java.util.Set;

public class array1 {

    public static int[] twoNumberSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { arr[i], arr[j] };
                }
            }
        }
        return new int[0];
    }

    // second method

    public static int[] targetElements(int[] arr, int target) {

        // create a ingaintiger hashset
        Set<Integer> nums = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int match = target - num;
            if (nums.contains(match)) {
                return new int[] { match, num };
            } else {

                nums.add(num);

            }
        }
        return new int[0];
    }

    // Calling the function
    public static void main(String[] args) {
        int[] arr = { 6, 5, 7, 9, 4, 0, 2 };
        int target = 10;

        int[] result1 = twoNumberSum(arr, target);
        System.out.println("\nThe answer :-");
        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }

        System.out.println("Time Complexity = O(n2) \nSpace Complexity = O(1) \n\n");

        int[] result2 = targetElements(arr, target);
        System.out.println("The answer :-");
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }

        System.out.println("Time Complexity = O(n2) \nSpace Complexity = O(1) \n\n");
    }
}
