import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("enter your name: ");
        String Name=new Scanner(System.in).nextLine();
        Capitalize(Name);
    }

    public static void Capitalize(String Name){
        String Cname=Name.substring(0,1).toUpperCase();
        String C1name=Cname.substring(1).toLowerCase();
        System.out.println(Cname+C1name);
    }
}
