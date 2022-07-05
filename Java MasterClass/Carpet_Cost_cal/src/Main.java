public class Main {
    public static void main(String[] args) {
        Floor area=new Floor(4,5);
        System.out.println(area.getArea());

        Carpet cost=new Carpet(8);

        Calculator cal=new Calculator(area,cost);
        System.out.println(cal.getTotalCost());

    }
}
