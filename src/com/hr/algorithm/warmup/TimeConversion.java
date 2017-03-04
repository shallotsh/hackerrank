package com.hr.algorithm.warmup;

import java.util.Scanner;

/**
* @author: Eric, shallotsh@gmail.com
* @date: 2017/3/4 上午11:07
*/
public class TimeConversion {

    public static String convert(String time12){
        if(time12 == null || time12.length() < 10){
            return "";
        }

        String[] items = time12.split(":");

        int deta = 12;
        if(items[2].endsWith("AM") && Integer.parseInt(items[0]) != 12){
            deta = 0;
        }

        if(items[2].endsWith("PM") && Integer.parseInt(items[0]) == 12){
            deta = 0;
        }

        int hour = (Integer.parseInt(items[0]) + deta)%24;
        int min = (Integer.parseInt(items[1]));
        int sec = (Integer.parseInt(items[2].substring(0,2)));


        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String time12 = scanner.nextLine();

        System.out.println(convert(time12));
    }
}
