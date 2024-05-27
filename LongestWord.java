import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        System.out.println("enter the word: ");
        String word = new Scanner(System.in).nextLine();
        longestWord(word);
    }

    public static void longestWord(String name) {
        if (name.length() != 0) {
            String[] name1 = name.split(" ");
            String longword = "";
            for (int i = 0; i < name1.length; i++) {
                if (name1[i].length() > longword.length()) {
                    longword = name1[i];
                }
            }
            System.out.println(longword);
        } else {
            System.out.println("enter valid word");
        }
    }
}
