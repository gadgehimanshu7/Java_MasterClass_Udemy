package com.company;



public class Main {

/*    public static void main(String[] args) {
	// write your code here
        int newScore=calculateScore("hima",100);
        System.out.println("new score is "+newScore);
        calculateScore(120);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("player "+playerName+" scored "+score+" points.");
        return score*100;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" points.");
        return score*10;
    }

    public static int calculateScore(){
        System.out.println("NO player score or name");
        return 0;
    }
*/
public static void main(String[] args) {
    calcFeetAndInchesToCentimeters(6,10);
    calcFeetAndInchesToCentimeters(23);
}

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet<0 || (inches<0 || inches>12))
        {
            System.out.println("invalid value");
            return -1;
        }else
        {
            double cent=inches*2.54;
            cent +=feet*12*2.54;
            System.out.println(feet+"feet and "+inches+"inches = " +cent+"cms");
            return cent;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
    if (inches<=0){
        return -1;
    }else
    {
        int inch=(int)inches%12;
        int feet=(int)inches/12;
        System.out.println(feet+" feet and "+inch+" inches");
        return calcFeetAndInchesToCentimeters(feet,inch);
    }
    }
}
