package com.hr.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by huangyawu on 2017/3/2.
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}
