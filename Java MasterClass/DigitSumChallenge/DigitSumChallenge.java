public class DigitSumChallenge {
    public static int sumDigits(int number){
        int sum=0;
        int r;
        if (number>=10)
        {
            while(number>0) {
                r = number % 10;           //125%10=5       -->  //12%10=2
                number = number / 10;      //n=125/10=12     -->  //12/10=1
                sum=sum+r;                  //s=0+5
            }
            return sum;
        }else
        return -1;

    }
}
