package com.section11;
import java.util.*;

public class maximumsubarray_6 {
    // Returns maximum sum in a subarray of size k.
    public static int maxSum(int arr[], int n, int k)
    {
        // k must be smaller than n
        if (n < k)
        {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int res = 0;
        for (int i=0; i<k; i++)
            res += arr[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
            curr_sum += arr[i] - arr[i-k];
            res = Math.max(res, curr_sum);
        }

        return res;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}