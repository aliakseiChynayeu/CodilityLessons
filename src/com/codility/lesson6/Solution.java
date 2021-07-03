package com.codility.lesson6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * that, given an array A consisting of N integers, returns the number of distinct values in array A.
     * For example, given array A consisting of six elements such that:
     *  A[0] = 2    A[1] = 1    A[2] = 1
     *  A[3] = 2    A[4] = 3    A[5] = 1
     * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
     * Write an efficient algorithm for the following assumptions:
     * N is an integer within the range [0..100,000];
     * each element of array A is an integer within the range [−1,000,000..1,000,000].
     */
    public static int solution(int[] A)
    {
        Map map = new HashMap<Integer, Integer>();
        for (int a : A)
        {
            map.put(a, a);
        }
        return map.size();
    }

    /**
     * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
     * given a non-empty array A, returns the value of the maximal product of any triplet.
     *
     * For example, given array A such that:
     *
     *   A[0] = -3
     *   A[1] = 1
     *   A[2] = 2
     *   A[3] = -2
     *   A[4] = 5
     *   A[5] = 6
     * the function should return 60, as the product of triplet (2, 4, 5) is maximal.
     *
     * Write an efficient algorithm for the following assumptions:
     *
     * N is an integer within the range [3..100,000];
     * each element of array A is an integer within the range [−1,000..1,000].
     * @param A
     * @return
     */
    public static int solution1(int[] A)
    {
        int n = 0;

        for (int a : A)
        {
            if (a < 0)
            {
                n++;
            }
        }
        Arrays.parallelSort(A);

        if (n == 0 || n == A.length)
        {
            return A[A.length-1]*A[A.length-2]*A[A.length - 3];
        }
        if (A[0]*A[1] > A[A.length - 2]*A[A.length - 3])
        {
            return A[0]*A[1]*A[A.length-1];
        }
        else return A[A.length-1]*A[A.length-2]*A[A.length-3];
    }

    /**
     * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given.
     * The J-th disc is drawn with its center at (J, 0) and radius A[J].
     *
     * We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).
     *
     * given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs.
     * The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
     */
    public static int solution2(int[] A)
    {
        int pairs = 0;
        long[] left = new long[A.length];
        long[] right = new long[A.length];

        for (int i=0; i< A.length; i++)
        {
            left[i] = i - A[i];
            if (Integer.MAX_VALUE - A[i] < i)
            {
                right[i] = Integer.MAX_VALUE;
            }
            else
            {
                right[i] = i + A[i];
            }
        }
        Arrays.parallelSort(left);
        Arrays.parallelSort(right);

        int leftIndex = 0 ;
        int rightIndex = 0;

        int openDiscs = 0;

        while(leftIndex < A.length)
        {
            if(left[leftIndex] <= right[rightIndex])
            {
                pairs = pairs + openDiscs;
                if (pairs > 10000000) return -1;
                openDiscs++;
                leftIndex++;
            }
            else
            {
                openDiscs--;
                rightIndex++;
            }
        }
        return pairs;
    }

    /**
     * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
     *
     * A[P] + A[Q] > A[R],
     * A[Q] + A[R] > A[P],
     * A[R] + A[P] > A[Q].
     * For example, consider array A such that:
     *
     *   A[0] = 10    A[1] = 2    A[2] = 5
     *   A[3] = 1     A[4] = 8    A[5] = 20
     * Triplet (0, 2, 4) is triangular.
     *
     * Write a function:
     *
     * class Solution { public int solution(int[] A); }
     *
     * that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
     */
    public static int solution3(int[] A)
    {
        Arrays.parallelSort(A);

        for(int i=0;i<A.length-2;i++){
            if(((long)A[i] + (long)A[i+1] > A[i+2]) &&
                    ((long)A[i+1] + (long)A[i+2] > A[i]) &&
                    ((long)A[i] + (long)A[i+2] > A[i+1])
            )
                return 1;
        }
        return 0;
    }
}
