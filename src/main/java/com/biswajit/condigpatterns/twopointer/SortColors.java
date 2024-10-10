package com.biswajit.condigpatterns.twopointer;


/*
Given an array, colors, which contains a combination of the following three elements:
0 (representing red)
1 (representing white)
2 (representing blue)

Sort the array in place so that the elements of the same color are adjacent,
with the colors in the order of red, white, and blue. To improve your problem-solving skills, do not utilize the built-in sort function.
 */

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        /*
        [2,2,1,1,0,0] -> [0,0,1,1,2,2]
         */

        int[][] inputs = {
                {0, 1, 0},
                {1, 1, 0, 2},
                {2, 1, 1, 0, 0},
                {2, 2, 2, 0, 1, 0},
                {2, 1, 1, 0, 1, 0, 2}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tcolors: " + Arrays.toString(inputs[i]));

            int[] sortedColors = sortColors(inputs[i].clone());
            System.out.println("\n\tThe sorted array is: " + Arrays.toString(sortedColors));

            System.out.println("----------------------------------------------------------------------------------------");

        }
    }

    public static int[] sortColors(int[] colors) {
        int start, current, end;
        start = 0;
        current = 0;
        end = colors.length - 1;

        while (current <= end) {
            if (colors[current] == 0) {
                int tmp = colors[start];
                colors[start] = colors[current];
                colors[current] = tmp;

                current++;
                start++;
            } else if (colors[current] == 1) {
                current++;
            } else {
                int tmp = colors[current];
                colors[current] = colors[end];
                colors[end] = tmp;

                end--;
            }
        }
        return colors;
    }
}


