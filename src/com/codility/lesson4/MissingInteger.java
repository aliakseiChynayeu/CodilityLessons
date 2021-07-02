package com.codility.lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 12/21/19
 */
public class MissingInteger {

    public static void main(String[] args) {

        int[] A = {1,3,6,4,1,2};
        int[] A2 = {1,2,3};
        int[] A3 = {-1,-3};
        int[] A4 = {2};
        int[] A5 = {1000,1001};
        int[] A6 = {2,1000,1001};
        int[] A7 = {1,1000,1001};
        int[] A8 = {1};
        int[] A9 = {-1000000,1000000};
//        assertEquals(5, Solution.solution2(A));
//        assertEquals(4, Solution.solution2(A2));
//        assertEquals(1, Solution.solution2(A3));
//        assertEquals(1, Solution.solution2(A4));
//        assertEquals(1, Solution.solution2(A5));
//        assertEquals(1, Solution.solution2(A6));
//        assertEquals(2, Solution.solution2(A7));
//        assertEquals(2, Solution.solution2(A8));
        assertEquals(1, Solution.solution2(A9));
    }
}
