public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse=0;
        int lastDigit;
        if (number<0){
            number=-1*number;
        }
        int revNumber=number;

        while(revNumber>0)
        {
            lastDigit=revNumber%10;
            reverse=(reverse*10)+lastDigit;
            revNumber=revNumber/10;
        }
        //System.out.println(reverse);
        if(number==reverse){
            return true;
        }return false;
    }
}
