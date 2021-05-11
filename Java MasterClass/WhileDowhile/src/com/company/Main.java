package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count=0;
//        while(count!=5){
//            System.out.println("Count value is "+count);
//            count++;
//        }
//        count=1;
//        while(true){
//            if (count==5){
//                break;
//            }
//            System.out.println("Count value is "+count);
//            count++;
//        }
//
//        count=1;
//        do
//        {
//            System.out.println("Count value is "+count);
//        }while (count!=6);

        //Create a method called isevennumber that takes a parameter of type int
        //Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        //return true if an even number, otherwise return false.

        int number=4;
        int finishNumber=20;
        int evenNumbersFound=0;
        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;

            }
            System.out.println("even value is "+number);
            evenNumbersFound++;
            if(evenNumbersFound>=5){
                break;
            }

        }
        System.out.println("Total even numbers found= "+evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        if (number%2==0){
            return true;
        }else
            return false;
    }
}
