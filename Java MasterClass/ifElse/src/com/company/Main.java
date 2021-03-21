package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

 /*
        calculateScore(false,800,5,100);

        calculateScore(true,10000,8,200);

    }
    public static int calculateScore( boolean gameOver, int score, int level, int bonus) {

        if(gameOver)
        {
            int finalScore=score + (level*bonus);
            System.out.println("finalScore = "+finalScore);
            return finalScore;

        }else
            return -1;
    }
*/

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Himanshu",highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Shantanu",highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Shraddha",highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Ganya",highScorePosition);
    }
    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName+" managed to get into the position " + highScorePosition +" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }else if(playerScore>=500 && playerScore<1000){
            return 2;
        }else if(playerScore>=100 && playerScore<500) {
            return 3;
        }else if(playerScore>=500 && playerScore<1000) {
            return 2;
        }else
            return 4;
    }
}

//ANOTHER METHOD!!!!!!

// if(playerScore>=1000){
//         return 1;
//         }else if(playerScore>=500){
//        return 2;
//        }else if(playerScore>=100) {
//        return 3;
//        }else if(playerScore>=500) {
//        return 2;
//        }
//        return 4;


//ANOTHER METHOD..............using jst single return
//int position=4;            //assuming it will return position 4.
//if(playerScore>=1000){
//    position=1;
//        }else if(playerScore>=500){
//    position=2;
//        }else if(playerScore>=100){
//    position=3;
//        }
//return position;
