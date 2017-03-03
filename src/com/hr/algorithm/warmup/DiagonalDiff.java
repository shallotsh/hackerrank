package com.hr.algorithm.warmup;


import java.util.Scanner;

public class DiagonalDiff {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] martrix = new int[n][n];
        int sum = 0;
        int k = n-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                martrix[i][j] = scanner.nextInt();
                if(i == j){
                    sum += martrix[i][j];
                }
            }
            sum -= martrix[i][k--];
        }

        System.out.println(Math.abs(sum));
    }

}
