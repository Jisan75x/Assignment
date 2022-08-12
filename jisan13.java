import java.util.Scanner;
public class asif13{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer Number");
        int a;
        a = input.nextInt();

        if(a!=0) {
            if (a > 0) {
                System.out.println("This number is positive");
            } else if (a < 0) {
                System.out.println("This number is negative");
            }
            else
            {
                System.out.println("This number is Zero");
            }
        }
    }
}
