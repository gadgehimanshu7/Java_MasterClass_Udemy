package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double firstDoubleValue=20d;
        double secondDoubleValue=80d;
        double result=firstDoubleValue+secondDoubleValue*100d;
        System.out.println(result);
        double remainder=result%40d;
        System.out.println(remainder);

        boolean zeroRem=true;
        boolean ifNotZero=false;
        if(remainder==0){
            System.out.println("Remainder is zero");
        }else
        System.out.println("Got Some Remainder");

        boolean isNoRemainder=(remainder==0)?true:false;
        System.out.println(isNoRemainder);

    }
}
