package com.codility.lesson5;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 1/4/20
 */
public class PassingCars {
    public static void main(String[] args) {

        int[] A = {0,1,0,1,1};
        int[] A1 = {4,1,3,2,6};
        int[] A2 = {4,1,3,2,5};
        int[] A3 = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        int[] A4 = {1,4,1};
        System.out.println("result - expected [5] :" + Solution.solution(A));
 /*       System.out.println("result - expected [0] :" + Solution.solution(A1));
        System.out.println("result - expected [1] :" + Solution.solution(A2));
        System.out.println("result - expected [0] :" + Solution.solution(A3));
        System.out.println("result - expected [0] :" + Solution.solution(A4));
        */
    }
}
