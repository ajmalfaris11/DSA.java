/*
 * QUESTION:-
 * move 6 to the end of the array
 * 
 * 
 * array-
 *   +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
 *   |  6  |  1  |  6  |  8  | 10  |  4  | 15  |  6  |  3  |  9  |  6  |  
 *   +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * 
 * target = 6
 * 
 * 
 */

public class array2 {

    public static void main(String[] args) {
        int[] arr = { 6, 1, 6, 8, 10, 4, 15, 6, 3, 9, 6 };
        int target = 6;

        targetToEnd(arr, target);

        System.out.println("\nThe answer :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void targetToEnd(int[] arr, int target) {
        int j = arr.length - 1;

        for (int i = 0; i < j; i++) {
            while (j > i && arr[j] == target) {
                j--;
            }

            if (arr[i] == target) {
                // Swap the elements
                arr[i] = arr[j];
                arr[j] = target;
                j--;
            }
        }
    }
}
