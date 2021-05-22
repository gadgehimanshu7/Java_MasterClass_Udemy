public class EvenDigitSum {
  public static void main(String[] args) {
    System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(252256));
  }
    public static int getEvenDigitSum(int number){
        int digit=0;
        if (number<0)
        {
            return -1;
        }else{
            digit=number%10;
            number/=10;
            if(digit%2==0){
                digit+=digit;
            }
            int sum=digit;
            return sum;
        }
    }
}
