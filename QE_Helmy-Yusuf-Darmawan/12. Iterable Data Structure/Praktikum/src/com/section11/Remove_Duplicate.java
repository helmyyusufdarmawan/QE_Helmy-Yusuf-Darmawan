package com.section11;

import org.jetbrains.annotations.NotNull;

public class Remove_Duplicate {
    private static int removeDuplicates(int @NotNull [] numbers) {
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

        System.out.print("Array = ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}
