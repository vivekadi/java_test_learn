import java.util.Scanner;

public class profit_loss {
    public  static void main(String[] Args)
    {
        //int loss_per=0;

        Scanner x=new Scanner(System.in);
        System.out.println("Enter the profit percentage");
        int profit_per=x.nextInt();
        System.out.println("Enter the amount lost in Rs.");
        int loss=x.nextInt();

        int investment=100000;
        int profit=1000*profit_per;

        if(loss>profit)
        {
            int loss_per = ((loss - profit) / 1000);
            System.out.println("After two years he gets a loss of "+loss_per+"%.");
        }

        else if(loss<profit)
        {
            int loss_per = ((profit - loss) / 1000);
            System.out.println("After two years he gets a profit of "+loss_per+"%.");
        }

        else
        {
            System.out.println("After two years he gets no loss or no gain.");
        }
    }
}
