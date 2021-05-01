package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n;
        int bitCoin;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of houses");
        n = sc.nextInt();
        System.out.println("Enter number of Coins");
        bitCoin = sc.nextInt();

        int temp = 0;
        //  int arr[]=new int[20];

        if(n%2!=0) {

            for (int i = 0; i < n; i += 2) {
                temp = temp + bitCoin;
                //  bitCoin = bitCoin + temp;
                //System.out.println("");

            }

        }else{
            for(int i=1;i<n;i+=2){
                temp=temp+bitCoin;
                // bitCoin=bitCoin+temp;
            }
        }
        System.out.println(temp);
    }
}
