package Work03;

public class MyUtil {

    public static double calculateBMI(double weight, double height) {
        double heightincm = height / 100;

        return weight / (heightincm * heightincm);

    }
    
    public static double average(int v1, int v2, int v3){
        double sum = v1 + v2 + v3;
        return sum/3.0;
    }
    
    
}
