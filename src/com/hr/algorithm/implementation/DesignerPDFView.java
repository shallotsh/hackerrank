package com.hr.algorithm.implementation;

import java.util.Scanner;

/**
 * @author Eric
 * @date 2017/3/4 下午9:56.
 */
public class DesignerPDFView {

    public static int calArea(String word, int[] heights){
        if(word == null || word.length() == 0 || heights == null || heights.length == 0){
            return 0;
        }

        int maxHeight = 0;
        for(int i=0; i<word.length(); i++){
            if(heights[word.charAt(i) - 'a'] > maxHeight){
                maxHeight = heights[word.charAt(i) - 'a'];
            }
        }

        return maxHeight * word.length();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        System.out.println(calArea(word, h));

        in.close();
    }
}
