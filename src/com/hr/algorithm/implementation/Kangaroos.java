package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
 * @author Eric
 * @date 2017/3/4 下午11:39.
 */
public class Kangaroos {

    public static boolean canCatchUp(int x1, int v1, int x2, int v2){
        int detaDis = x2 - x1;
        int detaV = v2- v1;

        if(detaDis * detaV >= 0){
            return false;
        }

        return detaDis % detaV == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        boolean res = canCatchUp(x1, v1, x2, v2);
        if(res){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
