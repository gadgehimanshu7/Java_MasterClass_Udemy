package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(2000));
    }
    public static String getDurationString(long minutes, long seconds){
        if (minutes<0 || (seconds<0 || seconds>59)){
            return "Invalid Value";
        }
            long extraMinutes = minutes % 60;
            long hour = minutes / 60;
            //bonus challenge part to convert in 2 digit
            String hourString = hour + "h";
            if (hour < 10) {
                hourString = "0" + hourString;
            }
            String minuteString = extraMinutes + "m";
            if (extraMinutes < 10) {
                minuteString = "0" + minuteString;
            }
            String secondString = seconds + "s";
            if (seconds < 10) {
                secondString = "0" + secondString;
            }
            return hourString + " " + minuteString + " " + secondString;
        }


    public static String getDurationString(long seconds){
        if(seconds<0){
            return "invalid value";
        }
            long minute=seconds/60L;
            long remSeconds=seconds%60L;
            //System.out.println(minute+" minute "+remSeconds+" seconds.");
            return getDurationString(minute, remSeconds);
        }

}
