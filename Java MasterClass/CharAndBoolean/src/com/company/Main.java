package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char myChar='D';
        char myUnicodeChar='\u0044';
        char myCopyRightChar='\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyRightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        int x;
        x=21;
        if(x>21)
        {
            System.out.println(myTrueBooleanValue);
        }
        else
            System.out.println(myFalseBooleanValue);

        String myString="this is my string";
        System.out.println("My string equal to " +myString);
        myString=myString+", this is more";
        System.out.println("My string equal to " +myString);
        String numberString="40.50";
        numberString=numberString+49.50;
        System.out.println(numberString);
        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("Last String is equal to "+lastString);

        //abbrevation
        int result=1+2;
        //result=result+1;
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result +=5;
        System.out.println(result);


    }
}
