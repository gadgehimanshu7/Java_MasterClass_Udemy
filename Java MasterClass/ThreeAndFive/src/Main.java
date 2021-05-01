public class Main {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int i = 0; i < 1000; i++) {
        if(ThreeAndFIve.DivThreeAndFive(i))
        {
            count++;
            sum=sum+i;
            System.out.println(i);
        }




        }
        System.out.println(count);
        System.out.println(sum);
    }
}
