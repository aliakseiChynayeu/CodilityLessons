package com.codility.lesson3;

import java.util.Arrays;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 12/19/19
 */
public class Solution {

    /**
     * Given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
     * @param X position of the frog
     * @param Y destination
     * @param D jump size
     * @return number of jumps
     */
    public static int solution(int X, int Y, int D){

        if ((Y - X) % D == 0)
            if (Y == X) {
                return 0;
            } else {
                return (Y - X) / D;
            }
        else {
            return ((Y - X) - (Y - X) % D) / D + 1;
        }
    }

    /**
     * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
     * which means that exactly one element is missing.
     * @param A array of integers
     * @return missing element
     */
    public static int solution(int[] A) {

        long sum = 0 ;
        for (int a : A){
            sum +=a;
        }
        long size = (long)(A.length + 1);
        long total = (size * (size + 1)) / 2;
        Long result = total - sum;
        return result.intValue();
    }


    /**
     * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.\
     * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
     * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
     * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
     * @param A
     * @return
     */
    public static int solution3(int[] A) {

        long x1 = 0, x2 = 0, sum = 0;
        Long p = Long.MAX_VALUE;
        for (int a : A) {
            x2 += a;
        }

        for (int i = 0; i < A.length-1; i++) {
            x1 += A[i];
            x2 -= A[i];
            if (p > Math.abs(x1 - x2))
            {
                p = Math.abs(x1 - x2);
            }
        }
        return p.intValue();
    }
}
