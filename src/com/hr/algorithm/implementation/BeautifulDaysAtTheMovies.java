package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
 * @author Eric
 * @date 2017/3/5 下午12:28.
 */
public class BeautifulDaysAtTheMovies {

    private static int getReservalNumber(int num){
        int target = 0;
        while(num != 0){
            target = target * 10 + (num % 10);
            num /= 10;
        }

        return target;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        int count = 0;
        for(int day = i; day <= j; day++){
            if(Math.abs(day - getReservalNumber(day)) % k == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
