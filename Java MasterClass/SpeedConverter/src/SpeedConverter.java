public class SpeedConverter {
    public static long toMilesPerHour(double kilometerPerHour){
        if(kilometerPerHour<0){
            return -1;
        }
        return Math.round(kilometerPerHour/1.609);
//        long milePerHour=Math.round(kilometerPerHour/1.609);
//        return milePerHour;

    }
    public static void printConversion(double kilometerPerHour) {
        if(kilometerPerHour<0){
            System.out.println("Invalid Value");
        }else {
//        double milePerHour=kilometerPerHour/1.609;
//        milePerHour=Math.round(milePerHour);
            long milePerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + milePerHour + " mi/h");
        }
    }
}
