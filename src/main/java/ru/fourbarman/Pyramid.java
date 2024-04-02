package ru.fourbarman;

import java.util.stream.IntStream;

/**
 * Pyramid.
 */
public class Pyramid {
    /**
     * pyramid(0) => [ ]
     * pyramid(1) => [ [1] ]
     * pyramid(2) => [ [1], [1, 1] ]
     * pyramid(3) => [ [1], [1, 1], [1, 1, 1]
     */
    public static int[][] pyramid(int n) {
        int[][] result = new int[n][];
        for (int i = 0; i < n; i++) {
            int[] temp = new int[i + 1];
            IntStream.range(0, i + 1).forEach(j -> temp[j] = 1);
            result[i] = temp;
        }
        return result;
    }
}
