public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){
        if(a>12 && a<=19 || b>12 && b<=19 || c>12 && c<=19){
            return true;
        }else
            return false;
    }
    public static boolean isTeen(int d){
        if(d>12 && d<=19)
        {
            return true;
        }
        else
            return false;
    }
}
