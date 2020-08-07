import java.util.Scanner;


public class prime_with1
{
    public static boolean prime_find(int l,int h,int d)
    {
        boolean edge = true;
        while (l <= h)
        {
            boolean f = false;
            for (int i = 2; i <= l / 2; ++i)
            {
                if (l % i == 0)
                {
                    f = true;
                    break;
                }
            }

            if (!f && l != 1)
            {
                if (l % 10 == 1)
                {
                    if(d==0)
                    {
                        if (l == h)
                        {
                            System.out.print(l);
                            break;
                        }

                        else
                            System.out.print(l + ",");
                    }
                    else if(d==1)
                    {
                        System.out.print(l);
                        edge = false;
                    }
                }
            }
            l++;
        }

        if(l!=h)
        {
            while (edge) {
                l=h;
                d = 1;
                h += 10;
                edge = prime_find(l, h, d);
            }
        }
        return false;
    }


    public static void main(String[] Args)
    {
        boolean edge=true;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the first number");
        int l=x.nextInt();
        System.out.println("Enter the last number");
        int h=x.nextInt();
        int d=0;
        //count=l;

        if(l<h && l>0)
        {
            edge=prime_find(l,h,d);
        }

    }

}
