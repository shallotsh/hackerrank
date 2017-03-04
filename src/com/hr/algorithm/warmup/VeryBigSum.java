package com.hr.algorithm.warmup;

import java.util.Scanner;

/**
* @author: Eric, shallotsh@gmail.com
* @date: 2017/3/4 上午11:07
*/
public class VeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0L;

        for(int i=0; i<n; i++){
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }

}
