import java.util.Scanner;

public class bike_points {
    public static void main(String[] Args)
    {
        int count=0;
        int odd=1;
        int even=1;
        int bonus=0;

        Scanner x=new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int dist=x.nextInt();
        if(dist<0)
             System.out.println("Invalid Input");

        if(dist==0)
            System.out.println("Your bonus points is 0");

        else {
            while(dist!=0)
            {
                count++;
                int b=dist%10;
                if(count%2!=0)
                    odd*=b;
                else
                    even*=b;
                dist/=10;
            }


            if (odd == even)
                bonus = 2 * odd;
            else bonus = Math.max(odd, even);

            System.out.println("Your bonus points is " + bonus);
        }
    }
}
