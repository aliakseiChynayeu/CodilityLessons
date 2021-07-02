package com.codility.lesson5;

/**
 * User: Aliaksei_Chynayeu
 * Codility lessons
 * 1/4/20
 */
public class Solution {

    public static int solution(int[] A) {

        int qAmount = 0;
        int pAmount = 0;
        int sum = 0;
        for (int a : A)
        {
            if(a == 0)
            {
                qAmount ++;
                pAmount = 0;
            }
            else
            {
                pAmount = 1;
            }
            sum += qAmount*pAmount;
            if (sum > 1000000000) return -1;
        }
        return sum;
    }

    public static int solutionCD(int A, int B, int K)
    {
        int b = B / K;
        int a = A / K;
        int result = (b * K - a * K) / K;
        if (A % K == 0) result ++;

        return result;
    }

    public static int[] solutionGRQ(String S, int[] P, int[] Q)
    {
        int[] result = new int[P.length];

        int[] sequence = {0 ,0 ,0, 0 };

        for(int i = 0; i < S.length(); i++)
        {
            switch (S.charAt(i)){
                case 'A' : sequence[0]++;break;
                case 'C' : sequence[1]++;break;
                case 'G' : sequence[2]++;break;
                case 'T' : sequence[3]++;break;
                default:break;
            }
        }

        int j = 0;
        for(int i = 0; i < P.length; i++)
        {
            result[j] = updateSequence(sequence, P[i], Q[i]);
            j++;
        }

        return result;
    }
    public static int updateSequence(int[] sequence, int minValue, int maxValue)
    {
        if (minValue > 4)
        {
            return updateSequence(sequence, 4, maxValue);
        }
        if (minValue > maxValue)
        {
            return 0;
        }
        if (minValue < 1)
        {
            return updateSequence(sequence, ++minValue, maxValue);
        }

         if (sequence[minValue - 1] == 0)
         {
             return updateSequence(sequence, ++minValue, maxValue);
         }
         sequence[minValue -1]--;
         return minValue;
    }
}
