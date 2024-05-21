import java.util.Scanner;

public class Distance {
    public static void main(String [] args){
        System.out.println("distance in kilometers: ");
        double scan=new Scanner(System.in).nextDouble();
        System.out.println("distance in meters: ");
        double scan1=new Scanner(System.in).nextDouble();
        System.out.println("distance in centimeters: ");
        double scan2=new Scanner(System.in).nextDouble();
        double all=scan2+(scan1*100)+(scan*100000);
        System.out.println(all);
    }
}
