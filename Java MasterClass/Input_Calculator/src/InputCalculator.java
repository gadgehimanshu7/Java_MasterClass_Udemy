import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
       int sum = 0;
        int counter = 0;
       double avg1;
       int avg = 0;
        Scanner sc = new Scanner(System.in);

 /*       for (int i = 0; i < 3; i++) {
            System.out.print("Enter number: ");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
            int number = sc.nextInt();

                counter += number;
            } else {

                System.out.println("Invalid Value");
            }
            sc.nextLine();
        }
            sum = counter;

            System.out.println(sum);

            sc.close();
    }
}
*/        //USING WHILE LOOP


 /*       while (true){
            int order=counter+1;
            System.out.print("Enter number #"+order+":");
            boolean isAnInt=sc.hasNextInt();
            if(isAnInt){
                int number= sc.nextInt();
                counter++;
                sum+=number;
                if(counter==4){
                    break;
                }
            }else{
                System.out.println("Invalid number");
            }

            sc.nextLine();
        }
        System.out.println(sum);
        sc.close();
    }
}
*/
        while(true) {
            boolean isAnInt=sc.hasNextInt();
            if (isAnInt){
            int number = sc.nextInt();
            counter++;
            sum=sum+number;
            avg1=(double)sum/counter;
            avg=(int)Math.round(avg1);
        }if (!isAnInt){
                System.out.println("SUM = "+sum+" AVG = "+avg);
                break;
            }


        }
        sc.close();
    }
}
