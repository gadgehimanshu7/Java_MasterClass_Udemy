package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] arr = new int[n];
        int sum = 0;
        //int sum2 =0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            //sum = arr[i];
            for (int j = 1; j < n; j++) {
                sum = array[i] + array[j];
                if (sum == k) {
                    System.out.println(array[i]+","+arr[j]);
                    //System.out.println(array[j]);
                    break;
                }

//
//                break;
//            }
                //  System.out.println(sum);

            }
        }
    }
}

