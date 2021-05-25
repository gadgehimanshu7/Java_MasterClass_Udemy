public class NumberToWords {
  public static void main(String[] args) {
        NumberToWords.numberToWords(100);
//        System.out.println(NumberToWords.reverse(100));
//        System.out.println(NumberToWords.getDigitCount(125));
    }
    public static void numberToWords(int number) {
        int remainder = 0;
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber=reverse(number);
        for(int i=0;i<getDigitCount(number);i++)
            {

                  switch (reverseNumber%10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                      default:
                          break;
                }
                reverseNumber=reverseNumber/10;
            }
        }

    public static int reverse(int num) {
        int reversed = 0;
        int lastDigit = 0;
        while (num != 0) {
            lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num = num / 10;
        }
        return reversed;
    }

    public static int getDigitCount(int numb) {
        if (numb < 0) {
            return -1;
        }
        int count = 1;
        while (numb > 9) {
            numb = numb / 10;
            count++;
        }
        return count;
    }
}
