package com.hr.algorithm.warmup;

import java.util.Scanner;

/**
* @author: Eric, shallotsh@gmail.com
* @date: 2017/3/4 上午11:35
*/
public class StairCase {

    public static void draw(int n){
        if(n <= 0){
            return;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j < n-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        draw( scanner.nextInt() );
    }
}
