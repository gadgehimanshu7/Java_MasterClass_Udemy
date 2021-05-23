public class GreatestCommonDivisor {
  public static void main(String[] args) {
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        int temp1=0;
        int temp2=0;
        int gcd=0;
        if(first<=9||second<=9){
            return -1;
        }
        temp1=1;
        if(first>=second) {
            while (temp1 <= second) {
                if ((first % temp1 == 0) && (second % temp1 == 0)) {
                    gcd = temp1;
                }
                temp1++;

            }
        }
        temp2=1;
            if(first<=second){
                while (temp2<=first){
                    if((first%temp2==0)&&(second%temp2==0)){
                        gcd=temp2;
                    }
                    temp2++;
                }

            }
            return gcd;
        }
}
