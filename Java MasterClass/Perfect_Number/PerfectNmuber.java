public class PerfectNumber {
  public static void main(String[] args) {
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(16));
    }
    public static boolean isPerfectNumber(int number){
        int divisor=1;
        int temp=0;
        if(number<1){
            return false;
        }
        while(divisor<number){
            if(number%divisor==0){
                temp=divisor+temp;
            }divisor++;
            if(temp==number)
                return true;
        }return false;
    }
}
