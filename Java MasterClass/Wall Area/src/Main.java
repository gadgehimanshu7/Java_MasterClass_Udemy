public class Main {
    public static void main(String[] args) {

        Wall areaWall=new Wall();
        System.out.println(areaWall.getArea());
        Wall areaWall1=new Wall(10,-1.5);
        System.out.println(areaWall1.getHeight());
        System.out.println(areaWall1.getArea());
        System.out.println();

        areaWall.setHeight(-12);
        areaWall.setWidth(2);
        System.out.println(areaWall.getHeight());
        System.out.println(areaWall.getWidth());
        System.out.println();
        System.out.println(areaWall.getArea());
        System.out.println(areaWall1.getArea());
    }
}
