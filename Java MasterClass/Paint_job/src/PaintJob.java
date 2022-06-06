public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket, int extraBucket){

        double areaOfWall;
        double noOfBucket;
        if(width<=0||height<=0||areaPerBucket<=0||extraBucket<0) {
            return -1;
        }else {
            areaOfWall=width*height;
            double areaCovered=areaPerBucket*extraBucket;
            double remArea=areaOfWall-areaCovered;
            noOfBucket=(remArea/areaPerBucket);
//            if(remArea%areaPerBucket!=0){
//                noOfBucket+=1;
//            }
            noOfBucket=(int)(Math.ceil(noOfBucket));

        }
        return (int)noOfBucket;
    }

    public static int getBucketCount(double width,double height,double areaPerBucket){

        double areaOfWall;
        int noOfBucket;
        if(width<=0||height<=0||areaPerBucket<=0) {
            return -1;
        }else {
            areaOfWall=width*height;
            noOfBucket=(int)(areaOfWall/areaPerBucket);
            if(areaOfWall%areaPerBucket!=0){
                noOfBucket+=1;
            }
            }
        return noOfBucket;
    }

    public static int getBucketCount(double area,double areaPerBucket) {
        int noOfBucket;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            noOfBucket = (int) (area / areaPerBucket);
            if (area % areaPerBucket != 0) {
                noOfBucket += 1;
            }
        }
        return noOfBucket;
    }
}
