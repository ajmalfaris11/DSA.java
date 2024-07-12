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

    // Calling the function
    public static void main(String[] args) {
        int[] arr = { 6, 5, 7, 9, 4, 0, 2 };
        int target = 10;
        int[] result = twoNumberSum(arr, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
