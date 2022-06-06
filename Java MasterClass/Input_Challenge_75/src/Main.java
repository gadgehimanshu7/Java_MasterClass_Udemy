import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int number;
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first=true;
        while (true) {
            System.out.println("Enter Number: ");
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {

                number = sc.nextInt();

                if(first){
                    first=false;
                    min=number;
                    max=number;
                }

                if (number > max) {

                    max = number;
                }else
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }

        }
        System.out.println("Min= " + min + "Max=" + max);
        sc.nextLine();
        sc.close();
    }
}

