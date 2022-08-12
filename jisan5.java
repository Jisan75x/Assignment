import java.util.Scanner;
public class asif5 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a, b, c, d;
        a = input.nextInt();
        b = input.nextInt();
        c = a / b;
        d = a % b;
        System.out.println("the quotient is " + c);
        System.out.println("the reminder  is " + d);
    }
}


