import java.util.Scanner;
public class asif12 {
    public static void main(String[]arg){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the integer");
        int a;
        a = input.nextInt();
        if(((a%4==0) && (a%100!=0)) ||(a%400==0) )
        {
            System.out.println("This year is a leap year");

        }
        else {
            System.out.println("This year is not a leap year");
        }
    }
}


