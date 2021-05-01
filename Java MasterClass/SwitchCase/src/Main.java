import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int value=1;
//        if(value==1)
//        {
//            System.out.println("one");
//        }else if(value==2){
//            System.out.println("two");
//        }else
//            System.out.println("default");
//    }

        //Switch value

//        Scanner sc=new Scanner(System.in);
//        int switchValue = sc.nextInt();
//        switch (switchValue) {
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4: case 5: case 6:
//                System.out.println("4 or 5 or 6");
//                System.out.println("it was " +switchValue);
//                break;
//            default:
//                System.out.println("any");
//
//
//        }

        //Switch character

        Scanner sc=new Scanner(System.in);
        char switchChar=sc.next().charAt(0);
        switch (switchChar){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            default:
                System.out.println("random alpha");
        }


    }

}
