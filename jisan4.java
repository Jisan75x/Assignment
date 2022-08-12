import java.util.Scanner;
public class asif4{
    public static void main(String[] arg)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the character ");
        char a= input.next().charAt(0);
        int b= a;

        System.out.println("The ascii value of this character is "+b);
    }
}