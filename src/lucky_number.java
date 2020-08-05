import java.util.*;

public class lucky_number {
    public static int number_digits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the car no:");
        int sum=0;
        int a=x.nextInt();
        if(a<=0)
        {
            System.out.println(a+" is not a valid car number");
        }
        else {
            int b = number_digits(a);

            if (b < 4) {
                System.out.println(a + " is not a valid car number");
            }

            else{
                while(a>0)
                {
                    int c=a%10;
                    sum+=c;
                    a/=10;
                    System.out.println(sum);
                }

                if(sum%3==0 || sum%5==0 || sum%7==0)
                {
                    System.out.println("Lucky Number");
                }

                else
                {
                    System.out.println("Sorry its not my lucky number");
                }
            }
        }
    }
}
