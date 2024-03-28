package studio7;

import java.util.Arrays;

public class University {
    static int[] values;

    public static void getDiagonal(int[][] a) {
        values = new int[a.length]; // Initialize the array with the proper size
        for (int i = 0; i < a.length; i++) {
            values[i] = a[a.length - 1 - i][i];
        }
        System.out.println(Arrays.toString(values)); // Use Arrays.toString() for printing
    }

    public static void main(String[] args) {
        // Correct way to pass a 2D array inline
        getDiagonal(new int[][]{{3, 4, 6},
                                {5, 7, 2},
                                {1, 2, 3}});
    }
}