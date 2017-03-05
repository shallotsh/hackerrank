package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
* @author: Eric, shallotsh@gmail.com
* @date: 2017/3/5 上午11:35
*/
public class SockMerchant {

    private static int getTheSamePair(int[] socks){
        int[] tags = new int[101];
        for(int i=0; i<tags.length; i++){
            tags[i] = 0;
        }

        for(int i=0; i<socks.length; i++){
            tags[socks[i]] ++;
        }

        int count = 0;

        for(int i=0; i<tags.length; i++){
            if(tags[i] >= 2){
                count += (tags[i] / 2);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        System.out.println(getTheSamePair(c));
    }
}
