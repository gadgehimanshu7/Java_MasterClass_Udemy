public class LastDigitChecker {
  public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println(LastDigitChecker.isValid(9));
    }
    public static boolean hasSameLastDigit(int no1,int no2, int no3){
        int ld1=0;
        int ld2=0;
        int ld3=0;
        if((no1<10||no1>999)||(no2<10||no2>999)||(no3<10||no3>999)){
            return false;
        }
        ld1=no1%10;
        ld2=no2%10;
        ld3=no3%10;
        if((ld1==ld2)||(ld1==ld3)||(ld2==ld3)){
            return true;
        }
        else return false;
    }
    public static boolean isValid(int number){
        while(number>9 && number <=1000){
            return true;
        }
        return false;
    }

}
