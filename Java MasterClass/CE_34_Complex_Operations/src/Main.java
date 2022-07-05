public class Main {
    public static void main(String[] args) {
        ComplexNumber cn=new ComplexNumber(1.0,1.0);
        cn.add(1,1);
        System.out.println(cn.getReal());
        System.out.println(cn.getImaginary());

        cn.subtract(2.0,2.0);
        System.out.println("sub= "+cn.getReal());
        System.out.println("sub= "+cn.getImaginary());
//
//        ComplexNumber cn1=new ComplexNumber(4,5);
//        cn1.add(cn);
//        System.out.println(cn1.getReal());
//        System.out.println(cn1.getImaginary());



    }
}
