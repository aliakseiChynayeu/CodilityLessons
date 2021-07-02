package com.codility.lesson3;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 12/19/19
 */
public class PermMissingElem {

    public static void main(String[] args) {

        int size = 100000;
        int[] A = new int[size];

        for (int i=0; i < size; i++)
        {
           A[i] = i + 1;
        }
        System.out.println("1 : "  + Solution.solution(A));
    }
}
