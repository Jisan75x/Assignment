import java.util.Scanner;
public class asif9 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch;
        ch = input.next().charAt(0);
        if (((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'))) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel");

            } else {
                System.out.println(ch + " is a consonant");
            }
        }
    }
}