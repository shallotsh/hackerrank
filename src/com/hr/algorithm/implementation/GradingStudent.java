package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
* @author: Eric, shallotsh@gmail.com
* @date: 2017/3/4 上午11:02
*/
public class GradingStudent {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] grades = new int[n];

        for(int i=0; i<n; i++){
            grades[i] = scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            if(grades[i] < 38){
                System.out.println(grades[i]);
                continue;
            }
            int mod = grades[i] % 5;
            if(mod >= 3){
                System.out.println(grades[i] + (5 - mod));
            }else{
                System.out.println(grades[i]);
            }
        }

    }
}
