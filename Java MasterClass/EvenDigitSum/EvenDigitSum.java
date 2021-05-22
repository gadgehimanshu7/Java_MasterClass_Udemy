public class EvenDigitSum {
  public static void main(String[] args) {
    System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(252256));
  }
  public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int digit=0;
        int temp=0;
        if (number<0)
        {
            return -1;
        }else{
            while(number>0) {
                digit = number % 10;
                number /= 10;
                if (digit % 2 == 0) {
                    temp=temp+digit;
                }
            }
            int sum=temp;
            return sum;
        }

    }
}
