import java.util.Scanner;

public class mul_adj {
    public static void main(String[] Args)
    {
        int temp_no=0;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first=x.nextInt();
        if(first<=0)
            System.out.println("Invalid Input");
        else
        {
            System.out.println("Enter the second number:");
            int second=x.nextInt();
            if(second<=0)
                System.out.println("Invalid Input");
            else
            {
                    if(first>=second)
                        System.out.println("Invalid Input");
                    else
                    {
                        System.out.println("Enter the number of terms:");
                        int no=x.nextInt();
                        if(no<=0)
                            System.out.println("Invalid Input");

                        else
                        {
                            System.out.print(first+", "+second+", ");
                            for(int i=1;i<=no;i++)
                            {

                                temp_no=first*second;
                                if(i!=no)
                                    System.out.print(temp_no+", ");
                                else
                                    System.out.print(temp_no);
                                first=second;
                                second=temp_no;
                            }
                        }
                    }


            }
        }





    }
}
