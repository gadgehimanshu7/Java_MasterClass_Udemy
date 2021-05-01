package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println("10000 at 2% interest= " +calculateInterest(10000.0,2.0));
        for(int i=2;i<9;i++){       //init;termination;increment
            System.out.println(calculateInterest(10000,i));      //String.format("%.2f"...)..//decimal upto 2 digits.
        }
        int count=0;
        for (int i=1;i<100;i++){
            if(isPrime(i)){
                count++;
                System.out.println("number " +i+" is a prime number");
            }
            if(count==10){
                break;
            }
        }
    }
    public static boolean isPrime(int n){          //prime number
        if(n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){    //OR    //i<=(long)Math.sqrt(n);
            if(n%i==0){

                return false;
            }
        }
        //System.out.println(n);
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
