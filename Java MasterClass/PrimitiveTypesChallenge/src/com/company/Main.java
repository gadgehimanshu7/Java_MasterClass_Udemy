package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteValue=10;
        short shortValue=20;
        int intValue=100;
        long longValue=50000+10*(byteValue+shortValue+intValue);
        System.out.println(longValue);
    }
}
