package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue= Float.MIN_VALUE;
        float myMaxFloatValue= Float.MAX_VALUE;
        System.out.println("my minimum float value is" +myMinFloatValue);
        System.out.println("my maximum float value is" +myMaxFloatValue);

        double myMinDoubleValue= Double.MIN_VALUE;
        double myMaxDoubleValue= Double.MAX_VALUE;
        System.out.println("my minimum double value is" +myMinDoubleValue);
        System.out.println("my maximum double value is" +myMaxDoubleValue);

        int myIntValue=5/3;
        float myFloatValue=5f/3f;         //OR 5.25f
        double myDoubleValue=5.0/3.0;           //precise
        System.out.println("my int value is" +myIntValue);
        System.out.println("my float value is" +myFloatValue);
        System.out.println("my double value is" +myDoubleValue);

        //pounds to kilograms

        double pounds=200d;
        double kg=pounds*0.45359237d;
        System.out.println("kgs is" +kg);
        



    }
}
