public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double no1, double no2){
        double numberOne= no1*1000;
        double numberTwo= no2*1000;

        if((int)numberOne==(int)numberTwo){
            return true;
        }else
            return false;


    }
}
//        System.out.println((int)numberOne);
//        System.out.println((int)numberTwo);

//        return numberOne == numberTwo;
