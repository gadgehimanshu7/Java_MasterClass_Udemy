public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real,double imaginary){
        this.imaginary=imaginary;
        this.real=real;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void add(double real, double imaginary){
        double r=this.real+real;
        double i=this.imaginary+imaginary;
        this.real=r;
        this.imaginary=i;

    }

    public void add(ComplexNumber a){
        double r=this.real+a.getReal();
        double i=this.imaginary+a.getImaginary();
        this.real=r;
        this.imaginary=i;

    }

    public void subtract(double real, double imaginary){
        double r=this.real-real;
        double i=this.imaginary-imaginary;
        this.real=r;
        this.imaginary=i;
    }

    public void subtract(ComplexNumber a){
        double r=this.real-a.getReal();
        double i=this.imaginary-a.getImaginary();
        this.real=r;
        this.imaginary=i;
    }
}
/////////////////////////*

/*
public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        super();
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(ComplexNumber cn) {
        double r = (this.real + cn.getReal());
        double i = (this.imaginary + cn.getImaginary());
        this.real = r;
        this.imaginary = i;
        // System.out.println("Real~"+r+" and Imaginary~"+i);
    }

    public void add(double real, double imaginary) {
        double r = (this.real + real);
        double i = (this.imaginary + imaginary);
        this.real = r;
        this.imaginary = i;
        // System.out.println("Real~"+r+" and Imaginary~"+i);
    }

    public void subtract(double real, double imaginary) {
        double r = (this.real - real);
        double i = (this.imaginary - imaginary);
        this.real = r;
        this.imaginary = i;
        // System.out.println("Real~"+r+" and Imaginary~"+i);
    }

    public void subtract(ComplexNumber cn) {
        double r = this.real - cn.getReal();
        double i = this.imaginary - cn.getImaginary();
        this.real = r;
        this.imaginary = i;
        // System.out.println("Real~"+r+" and Imaginary~"+i);
    }
}
*/