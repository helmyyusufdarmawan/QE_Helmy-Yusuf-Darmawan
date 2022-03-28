package com.section11;

import java.util.List;
import java.util.ArrayList;

public class Array_Unique{
    public static void main(String[] args) {

        int[] arr1 = new int[] { 1, 2,3,4 };
        int[] arr2 = new int[] { 1,3,5,10,16,2,4 };

        boolean contains = false;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    contains = true;
                    break;
                }
            }

            if(!contains){
                list.add(arr1[i]);
            }
            else{
                contains = false;
            }
        }
        System.out.println(list);

    }
}
