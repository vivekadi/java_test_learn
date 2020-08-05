import java.util.Scanner;

public class factors_num {
    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num==0)
        {
            System.out.println("No Factors");
        }

        else
        {
            if (num<0)
            {
                num=Math.abs(num);
            }

            for(int i=1;i<=num;i++)
            {
                if(i<num)
                {
                    if(num%i==0)
                        System.out.print(i+", ");
                }

                if(i==num)
                {
                    System.out.println(i);
                }

            }

        }


    }
}
