import java.util.Scanner;

public class Threates {
    public static void main(String[] args) {
        System.out.println("enter the width of theatre: ");
        int n=new Scanner(System.in).nextInt();
        System.out.println("enter the height of theatre: ");
        int m=new Scanner(System.in).nextInt();
        System.out.println("enter the height of flagstone: ");
        int a=new Scanner(System.in).nextInt();
        if (n%a!=0){
            n+=1;
        }
        if (m%a!=0){
            m+=1;
        }
        int b=n/a;
        int c=m/a;
        int f=b*c;
        System.out.println(f);
    }
}
