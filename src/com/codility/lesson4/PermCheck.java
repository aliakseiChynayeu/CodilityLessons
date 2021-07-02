package com.codility.lesson4;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 12/21/19
 */
public class PermCheck {

    public static void main(String[] args) {

        int[] A = {4,1,3,2};
        int[] A1 = {4,1,3,2,6};
        int[] A2 = {4,1,3,2,5};
        int[] A3 = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        int[] A4 = {1,4,1};
        System.out.println("result - expected [1] :" + Solution.solution(A));
        System.out.println("result - expected [0] :" + Solution.solution(A1));
        System.out.println("result - expected [1] :" + Solution.solution(A2));
        System.out.println("result - expected [0] :" + Solution.solution(A3));
        System.out.println("result - expected [0] :" + Solution.solution(A4));
    }
}
