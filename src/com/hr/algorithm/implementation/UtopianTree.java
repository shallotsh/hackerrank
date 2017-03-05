package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
 * @author huangyawu
 * @date 2017/3/5 下午12:02.
 */
public class UtopianTree {

    private static int getTheHeight(int cycles){
        int height = 1;
        for(int i=0; i<cycles; i++){
            height *= 2;
            i++;
            if(i<cycles){
                height += 1;
            }
        }

        return height;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int cycles = scanner.nextInt();
            System.out.println(getTheHeight(cycles));
        }
    }
}
