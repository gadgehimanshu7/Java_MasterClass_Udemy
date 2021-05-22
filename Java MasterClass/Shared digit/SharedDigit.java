public class SharedDigit {
  public static void main(String[] args) {
        System.out.println(SharedDigit.hasSharedDigit(12,32));
        System.out.println(SharedDigit.hasSharedDigit(17,32));
        System.out.println(SharedDigit.hasSharedDigit(9,99));
        System.out.println(SharedDigit.hasSharedDigit(100,10));
    }

    public static boolean hasSharedDigit(int no1,int no2) {
        int unitPlace1 = 0;
        int tensPlace1 = 0;
        int unitPlace2 = 0;
        int tensPlace2 = 0;
        if ((no1 <= 9 || no2 > 99) ||(no1 > 99 || no2 <= 9)) {
            return false;
        } else {

            // while(no1>9 && no2<99){
            unitPlace1 = no1 % 10;
            tensPlace1 = no1 / 10;
            unitPlace2 = no2 % 10;
            tensPlace2 = no2 / 10;

        }
     //   System.out.println(unitPlace1 + " " + unitPlace2 + " " + tensPlace1 + " " + tensPlace2);
        if ((unitPlace1 == unitPlace2) || (unitPlace1 == tensPlace2) || (tensPlace1 == unitPlace2) || (tensPlace1 == tensPlace2))
        {   return true;}
        else
            return false;
    }
}
