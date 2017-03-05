package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
* @author: Eric, shallotsh@gmail.com
* @date: 2017/3/5 下午12:28
*/
public class AngryProfessor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while(cases-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int count = 0;
            while(n-- > 0){
                int time = scanner.nextInt();
                if(time <= 0){
                    count++;
                }
            }
            if(count >= k){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
