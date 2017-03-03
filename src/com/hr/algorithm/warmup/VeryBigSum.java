package com.hr.algorithm.warmup;

import java.util.Scanner;


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
