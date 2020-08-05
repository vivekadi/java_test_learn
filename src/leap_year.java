import java.util.Scanner;

public class leap_year {
    public static void main(String[] Args)
    {
        int count=0;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=x.nextInt();
        int temp_year=year;

        while(temp_year!=0)
        {
            temp_year /= 10;
            count++;
        }

        if(count!=4 || year<0)
        {
            System.out.println("Invalid Year");
        }

        else
        {
            if((year%4==0 && year%100!=0)|| year%400==0)
            {
                System.out.println("Leap Year");
            }

            else
            {
                System.out.println("Not a Leap Year");
            }
        }

    }
}
