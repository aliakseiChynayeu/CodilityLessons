package com.codility.lesson3;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 *
 * A small frog wants to get to the other side of the road.
 * The frog is currently located at position X and wants to get to a position greater than or equal to Y.
 * The small frog always jumps a fixed distance, D.
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * 12/19/19
 */
public class FrogJmp {

    public static void main(String[] args){

        System.out.println( "1 : " + Solution.solution(10,85,30));
        System.out.println( "2 : " + Solution.solution(0,32,8));
        System.out.println( "1 : " + Solution.solution(10,10,9));

    }
}
