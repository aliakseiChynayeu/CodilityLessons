package com.codility.lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 12/21/19
 */
public class MaxCounters {

    public static void main(String[] args) {


        int[] A = {3,4,4,4,1,4,4};
        int[] result = Solution.solution1(3,A);
        System.out.print("Should be [3,2,2,4,2] :" );

        for (int a : result){
            System.out.print(" " + a);
        }
        System.out.println();
    }
}
