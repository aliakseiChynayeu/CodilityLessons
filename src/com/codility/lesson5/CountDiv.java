package com.codility.lesson5;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 9/6/20
 */
public class CountDiv {
    public static void main(String[] args) {

        System.out.println("Expected : 3, result : " + Solution.solutionCD(6, 11, 2));
        System.out.println("Expected : 2, result : " + Solution.solutionCD(7, 11, 2));
        System.out.println("Expected : 12345, result : " + Solution.solutionCD(101, 123000000, 10000));
        System.out.println("Expected 20: , result : " + Solution.solutionCD(11, 345, 17));
        System.out.println("Expected 1: , result : " + Solution.solutionCD(10, 10, 5));
    }
}
