import java.util.Scanner;
public class asif7 {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two integers ");
        int a,b;
        a = input.nextInt();
        b=input.nextInt();
        System.out.println("Before swapping a ="+a);
        System.out.println("Before swapping b="+b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("after swapping a ="+a);
        System.out.println("after swapping b="+b);



    }
}
