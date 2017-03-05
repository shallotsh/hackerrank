package com.hr.algorithm.implementation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Eric
 * @date 2017/3/4 下午11:51.
 */
public class BetweenTwoSets {

    public static int findtheNumberofBetweenSets(int[] a, int[] b){
        if(a == null || b == null || a.length == 0 || b.length == 0){
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;
        for(int e: a){
            if(e > maxValue){
                maxValue = e;
            }
        }

        int minValue = Integer.MAX_VALUE;
        for(int e: b){
            if(e < minValue){
                minValue = e;
            }
        }

        int count = 0;

        for(int i=maxValue; i<=minValue; i++){
            boolean isCount = true;
            for(int j=0; j<a.length && isCount; j++){
                if(i % a[j] != 0){
                    isCount = false;
                }
            }

            for(int j=0; j < b.length && isCount; j++){
                if(b[j] % i != 0){
                    isCount = false;
                }
            }

            if(isCount){
                count ++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        System.out.println(findtheNumberofBetweenSets(a, b));
    }

}
