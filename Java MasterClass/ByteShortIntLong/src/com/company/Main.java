package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue=10000;
        int myMinValue=Integer.MIN_VALUE;     //32 bits
        int myMaxValue=Integer.MAX_VALUE;
        System.out.println("my minimum value is "+myMinValue);
        System.out.println("my maximum value is "+myMaxValue);
        System.out.println("Busted maximum value is "+ (myMaxValue+1)); //overflow
        System.out.println("Busted minimum value is "+ (myMinValue-1));
        int myBigIntTest=2_147_483_647;
        
        byte myMinByteValue=Byte.MIN_VALUE;   //1 byte= 8 bits
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("The minimum Byte Value is "+myMinByteValue);
        System.out.println("The maximum Byte Value is "+myMaxByteValue);

        short myMinShortValue=Short.MIN_VALUE;    //16 bits
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("The minimum Short Value is "+myMinShortValue);
        System.out.println("The maximum Short Value is "+myMaxShortValue);

        long myLongValue=100;
        long myMinLongValue=Long.MIN_VALUE;    //16 bits
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("The minimum long Value is "+myMinLongValue);
        System.out.println("The maximum long Value is "+myMaxLongValue);
        long myBigLongTest=2_147_483_647_234L;
        System.out.println(myBigLongTest);

        int mytotal = (myMinValue/2);                      //casting

        byte myNewByteValue= (byte) (myMinByteValue/2);     //casting

        System.out.println(mytotal);
        System.out.println(myNewByteValue);


    }
}
