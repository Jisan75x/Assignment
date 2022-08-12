

    import java.util.Scanner;
    public class asif10 {
        public static void main(String[] arg)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter three integer Number");
             int a,b,c;
             a = input.nextInt();
             b = input.nextInt();
             c = input.nextInt();
            if(a>b && a>c)
            {
                System.out.println("Largest number is "+a);
            }
            else if(b>a && b>c)
            {
                System.out.println("Largest number is "+b);
            }
            else
            {
                System.out.println("Largest number is "+c);
            }
        }
    }

