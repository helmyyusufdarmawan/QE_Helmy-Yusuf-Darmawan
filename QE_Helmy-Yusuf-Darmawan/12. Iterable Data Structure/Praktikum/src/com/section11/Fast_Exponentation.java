package com.section11;

public class Fast_Exponentation {
    static int power(int x, int n)
    {
        int res = 1; // Initialize result

        x = x; // Update x if it is more than or
        // equal to p

        if (x == 0)
            return 0; // In case x is divisible by p;

        while (n > 0)
        {

            // If y is odd, multiply x with result
            if ((n & 1) != 0)
                res = (res * x);

            // y must be even now
            n = n >> 1; // y = y/2
            x = (x * x);
        }
        return res;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int x = 2;
        int n = 3;
        System.out.print("Output is " + power(x, n));
    }
}
