package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        checkNumber(-1);
        checkNumber(0);
        checkNumber(1);
    }
    public static void checkNumber(int number){
        if(number>0){
            System.out.println(number+" is a positive number ");
        }else if(number<0){
            System.out.println(number+" is a negative number ");
        }else
        {
            System.out.println(number+" is a Zero number ");
        }
    }
}
