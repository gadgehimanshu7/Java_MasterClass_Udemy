public class FactorPrinter {
  public static void main(String[] args) {
        FactorPrinter.printFactors(8);
    }
    public static void printFactors(int number){
        int divisor=1;
        int temp1=0;
       if(number<1) {
           System.out.println("Invalid Value");
       }
       while(divisor<=number){
            if(number%divisor==0){

                System.out.println(divisor);
            }divisor++;
        }
    }
}
