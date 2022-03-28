package com.section11;
import java.util.*;

public class arraymerge_1 {
    public static void main(String[] args) {
        String[] array1 = {"Kazuya", "jin", "lee"};
        String[] array2 = {"Kazuya", "feng"};
        mergeUniqueValues(array1, array2);
    }

    public static void mergeUniqueValues(String[] arr1, String[] arr2) {
        Set noDuplicateSet = new LinkedHashSet();
        noDuplicateSet.addAll(Arrays.asList(arr1));
        noDuplicateSet.addAll(Arrays.asList(arr2));

        String[] noDuplicateArray = new String[noDuplicateSet.size()];
        noDuplicateSet.toArray(noDuplicateArray);

        Object[] str3 = noDuplicateSet.toArray();
        System.out.println(Arrays.toString(str3));



    }
}

