package com.hr.algorithm.warmup;


import java.util.Scanner;

/**
* @author: Eric, shallotsh@gmail.com
* @date: 2017/3/4 上午11:07
*/
public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();


        long sum = a + b + c + d + e;
        long min = Math.min(Math.min(Math.min(a,b), Math.min(c, d)),e);
        long max = Math.max(Math.max(Math.max(a,b), Math.max(c, d)),e);

        System.out.println((sum - max) + " " + (sum - min));

    }
}
