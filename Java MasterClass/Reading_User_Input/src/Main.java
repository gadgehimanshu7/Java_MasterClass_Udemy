import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your year of birth");
        boolean hasNextInt= scanner.hasNextInt();

        if(hasNextInt) {
        int year= scanner.nextInt();
            if (year <= 0) {
                System.out.println("Enter valid year in positive");
                System.out.println("Enter your year of birth");
                year = scanner.nextInt();
            }
                int age = 2022 - year;
                if(age<=0 || age>120){
                    System.out.println("Invalid year of birth");
                }else{
                    scanner.nextLine();//handle next line character.

                    System.out.println("Enter your name");
                    String name = scanner.nextLine();
                    System.out.println("year of birth is: " + year);
                    System.out.println("Age of the person is: " + age);
                    System.out.println("Your name is: " + name);
            }
        }else{
            System.out.println("unable to parse year");
        }
        scanner.close();
    }
}
