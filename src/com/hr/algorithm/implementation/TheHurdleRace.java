package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
 * @author Eric
 * @date 2017/3/5 上午11:55.
 */
public class TheHurdleRace {

    private static int calcTheNumberofMagicBeverages(int[] hurdles, int k){
        if(hurdles == null || hurdles.length == 0 ){
            return 0;
        }
        int maxHeight = Integer.MIN_VALUE;
        for(int e : hurdles){
            if(e > maxHeight){
                maxHeight = e;
            }
        }

        if(maxHeight - k > 0){
            return maxHeight - k;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        System.out.println(calcTheNumberofMagicBeverages(height, k));
    }

}
