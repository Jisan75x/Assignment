import java.util.Scanner;
public class asif6 {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two integers ");
        int a,b,c;
        a = input.nextInt();
        b=input.nextInt();
        System.out.println("Before swapping a ="+a);
        System.out.println("Before swapping b="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("after swapping a ="+a);
        System.out.println("after swapping b="+b);



    }
}
