
import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        System.out.println("enter name: ");
        String s=new Scanner(System.in).nextLine();
        String[] s1= s.split("");
        String revword ="";
        for (int i=s1.length-1;i>=0;i--){
            revword+=s1[i];
            //System.out.println(s1[i]);
        }
        System.out.println(revword);
        if (s.equals(revword)){
            System.out.println("is Polynomial");
        }else {
            System.out.println("is not Polynomial");
        }
    }
}
