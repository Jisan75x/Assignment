import java.util.Scanner;
public class asif8 {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer Number");
         int a;
         a = input.nextInt();
        if(a%2==0)
        {
            System.out.println("This number is even");
        }
        else {
            System.out.println("This number is odd");
        }
    }
}
