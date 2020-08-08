import java.util.Scanner;

public class sumandproduct {
    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        if(X<=0)
        {
            System.out.println("Invalid Input");
        }

        else
        {
            int Y = x.nextInt();
            if (Y <= 0)
            {
                System.out.println("Invalid Input");
            }

            else
            {
                int sum = X + Y;
                int prod = X * Y;

                int b = sum % 10;
                int c = sum / 10;

                int sum_rev = b * 10 + c;

                if (prod == sum_rev)
                    System.out.println("You are Lucky! Here Is you Gift.");
                else
                    System.out.println("Better Luck Next Time");
            }

        }

    }

}
