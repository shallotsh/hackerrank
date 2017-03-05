package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
 * @author Eric
 * @date 2017/3/4 下午10:27.
 */
public class AppleAndOrange {

    public static int calcFallOnHouseFruits(int origin, int [] distance , int s, int t){
        if(distance == null || distance.length < 1){
            return 0;
        }

        int count = 0;

        for(int i=0; i<distance.length; i++){
            int end = distance[i] + origin;
            if(end >= s && end <= t){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        System.out.println(calcFallOnHouseFruits(a, apple, s, t));
        System.out.println(calcFallOnHouseFruits(b, orange, s, t));
    }
}
