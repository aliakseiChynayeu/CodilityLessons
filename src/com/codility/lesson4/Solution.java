package com.codility.lesson4;

import java.util.Arrays;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 12/21/19
 */
public class Solution {

    /**
     * <B>PermCheck</B>
     * Given an array A, returns 1 if array A is a permutation and 0 if it is not.
     * <B>Wrong</B>There is an issue with antiSum: [1,4,1]
     * @param A
     * @return
     */
    public static int solutionWrong(int[] A){
        long elemSum = 0;
        long permSum = ((A.length) * (A.length + 1)) / 2;

        for (int a : A) {
            elemSum += a;
        }
        return (permSum - elemSum == 0) ? 1 : 0 ;
    }

    /**
     * <B>PermCheck</B>
     * Given an array A, returns 1 if array A is a permutation and 0 if it is not.
     * @param A
     * @return
     */
    public static int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 1 ; i < A.length;  i++) {
            if (A[i] != (A[i-1] + 1)) {
                return 0;
            }
        }
        return A[A.length - 1] == A.length ? 1 : 0 ;
    }

    /**
     * <b>FrogRiverOne solution</b>
     * Given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
     * @param X
     * @param A
     * @return
     */
    public static int solution(int X, int[] A) {

        long size = (long) X;
        long permSum = size*(size+1)/2;
        long resultSum = 0;
        int[] B = new int[X];

        for(int i = 0; i < A.length ; i++)
        {
            if ((A[i] <= X) && (B[A[i] - 1] == 0)) {
                resultSum += A[i];

                if (resultSum == permSum) {
                    return i;
                }
                B[A[i] - 1] = A[i];
            }
        }

        return -1;
    }

    /**
     * You are given N counters, initially set to 0, and you have two possible operations on them:

     increase(X) − counter X is increased by 1,
     max counter − all counters are set to the maximum value of any counter.
     A non-empty array A of M integers is given. This array represents consecutive operations:

     if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
     if A[K] = N + 1 then operation K is max counter.
     * @param N
     * @param A
     * @return
     */
    public static int[] solution1(int N, int[] A) {
        int[] B = new int[N];
        int maxCounter = 0;
        int counter = 0;

        for (int a : A) {

            //Max counter case
            if (a > N) {
                maxCounter = counter;
            }
            else {
                if (B[a - 1] < maxCounter) {
                   B[a - 1] = maxCounter;
                }
                B[a - 1]++;
                if (counter < B[a - 1]){
                    counter = B[a - 1];
                }
            }
        }

        for (int i = 0; i < B.length ; i++) {
            if (B[i] < maxCounter) {
                B[i] = maxCounter;
            }
        }

        return B;
    }


    /**
     * Given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
     * @param A
     * @return
     */
    public static int solution2(int[] A) {

        Arrays.sort(A);
        if (A.length == 1 || A[0] > 1){
            if (A[0] == 1) return 2;
            return 1;
        }

        for (int i = 1; i < A.length; i++)
        {
            if (A[i] > 1 && (A[i] != A[i-1]) && ((A[i-1] + 1) != A[i])){
                if(A[i - 1] < 0) return 1;
                return A[i - 1] + 1;
            }
        }
        if (A[A.length - 1] > 0) return A[A.length - 1] + 1;
        else return 1;
    }
}
