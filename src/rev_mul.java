import java.util.Scanner;

public class rev_mul {
    public static int revs(int n)
    {
        int b=n%10;
        int c=n/10;
        return 10*b+c;
    }


    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        int num1=x.nextInt();
        int num2=x.nextInt();

        int prod1=num1*num2;

        int r_num1=revs(num1);
        int r_num2=revs(num2);

        int prod2=r_num1*r_num2;

        if(prod1==prod2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
