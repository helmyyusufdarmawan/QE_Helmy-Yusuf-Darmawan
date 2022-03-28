package com.section11;
import java.util.*;

public class removeduplicates_5 {
    private static int removeDuplicates(int[] numbers) {
        int a = numbers.length;

        int x = 0;

        for (int y = 0; y < a; y++) {

            if (y < a - 1 && numbers[y] == numbers[y + 1]) {
                continue;
            }

            numbers[x++] = numbers[y];
        }

        return x;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 2,3,3,3,6,9,9 };
        int newLength = removeDuplicates(numbers);

        System.out.println(newLength);

       /* System.out.print("Array = ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        */
    }

}
