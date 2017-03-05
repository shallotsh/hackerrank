package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
 * @author Eric
 * @date 2017/3/5 上午11:15.
 */
public class DivisibleSumPairs {

    private static int findTheNumberofPairs(int[] a, int k){
        if(a == null || a.length == 0 || k == 0){
            return 0;
        }

        int count = 0;

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if((a[i] + a[j]) % k == 0){
                    count ++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        System.out.println(findTheNumberofPairs(a, k));
    }


}
