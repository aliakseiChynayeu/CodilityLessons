package com.codility.lesson4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 12/21/19
 */
public class FrogRiverOne {


    public static void main(String[] args) {

        int[] A = {1,3,1,4,2,3,5,4};
        int[] A2 = {1,3,1,1,2,3,5,1};
        int[] A3 = {1,2,3,4};
        int[] A4 = new int[99999];
        for (int i = 0; i < 99999; i++){
            A4[i] = i+1;
        }
        assertEquals(6, Solution.solution(5, A));
        assertEquals(-1, Solution.solution(5, A2));
        assertEquals(3, Solution.solution(4, A3));
        assertEquals(99998, Solution.solution(99999, A4));
    }
    @Test
    @DisplayName("Test for FrogRiverOne solution")
    void testSolution(){

        int[] A = {1,3,1,4,2,3,5,4};
        int[] A2 = {1,3,1,1,2,3,5,1};
        assertEquals(6, Solution.solution(5, A));
        assertEquals(-1, Solution.solution(5, A));
    }
}
