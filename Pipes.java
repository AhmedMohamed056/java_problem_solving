import java.util.Scanner;

public class Pipes {
    public static void main(String[] args) {
        double[] arr={1000,500,100,25,10,5,1};
        System.out.println("enter number of meters: ");
        double scan=new Scanner(System.in).nextDouble();
        double scan1=scan*100;
        double resl=0.0;
        int lop;
        if (scan1%1000==0) {
             lop = (int) scan1 ;
        }else {
            lop=(int)scan1+1;
        }
        a:for (int i=0;i<=lop;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (resl<scan1){
                    resl += arr[j];
                    if (resl>scan1){
                        resl-=arr[j];
                    }
                }
                if (resl==scan1){
                    System.out.println(resl);
                    break a;
                }

            }
        }
    }
}
