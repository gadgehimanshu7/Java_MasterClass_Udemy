public class Main {
    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(1.5,2.5,1,2));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5,1));

        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5));
        System.out.println(PaintJob.getBucketCount(7.25,4.3,2.35));

        System.out.println(PaintJob.getBucketCount(3.26, 0.75));


    }
}
