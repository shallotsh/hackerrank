package com.hr.algorithm.warmup;

import com.sun.javafx.binding.StringFormatter;

import java.text.NumberFormat;
import java.util.Scanner;

/**
* @author: Eric, shallotsh@gmail.com
* @date: 2017/3/4 上午11:26
*/
public class PlusMinus {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int positive = 0;
        int zero = 0;
        int negative = 0;

        for(int i=0; i<n; i++){
            int tmp = scanner.nextInt();
            if(tmp > 0){
                positive++;
            }else if(tmp < 0){
                negative++;
            }else{
                zero++;
            }
        }

        double pr = (positive*1.0 / n);
        double zr = (zero * 1.0 / n);
        double nr = (negative * 1.0 / n);

        System.out.println(String.format("%.6f", pr));
        System.out.println(String.format("%.6f", nr));
        System.out.println(String.format("%.6f", zr));
    }
}
