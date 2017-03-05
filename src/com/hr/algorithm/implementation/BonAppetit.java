package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
 * @author Eric
 * @date 2017/3/5 上午11:26.
 */
public class BonAppetit {

    private static void judge(int[] price, int k, int charged){
        int total = 0;
        for(int i=0; i<price.length; i++){
            if(i != k){
              total += price[i];
            }
        }

        total /= 2;

        if(total == charged){
            System.out.println("Bon Appetit");
            return;
        }

        System.out.println(charged - total);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] price = new int[n];

        for(int i=0; i<n; i++){
            price[i] = scanner.nextInt();
        }

        int charged = scanner.nextInt();

        judge(price, k, charged);
    }
}
