import java.util.Scanner;

public class pencil_count {
    public static int series(int x)
    {
        return x*x;
    }

    public static void main(String[] Args)
    {
        int pencils=0;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the standard: ");
        int a=x.nextInt();

        if(a>0 && a<13)
        {
            if (a==1)
            {
                System.out.println("Nila gets "+a+" pencils");
            }

            else
            {
                while(a>0)
                {
                    pencils+=series(a);
                    a--;
                }

                System.out.println("Nila gets "+pencils+" pencils");
            }
        }

        else
        {
            System.out.println("Invalid Standard");
        }
    }

}
