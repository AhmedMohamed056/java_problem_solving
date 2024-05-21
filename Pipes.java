import java.util.Scanner;

public class Pipes {
    public static void main(String[] args) {
        int[] arr={1000,500,100,25,10,5,1};
        System.out.println("enter number of meters: ");
        double scan=new Scanner(System.in).nextDouble();
        double scan1=scan*100;
        double resl=0.0;
        int i;
        for ( i=0;i<arr.length;i++){
            resl+=arr[i];
            if (scan1==resl){
                System.out.println(resl);
            }else {
                i=0;
            }


        }
    }
}
