import java.util.Scanner;


public class new_primes {
    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        int l=x.nextInt();
        int h=x.nextInt();

        if(l<h && l>0)
        {
            while(l<=h)
            {
                boolean f=false;
                for (int i=2;i<=l/2;++i)
                {
                    if(l%i==0)
                    {
                        f=true;
                        break;
                    }
                }

                if(!f && l !=0 && l!=1)
                    System.out.print(l+" ");
                ++l;
            }
        }
        else
        {
            System.out.println("Provide valid input");
        }
    }
}
