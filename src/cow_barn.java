import java.util.Scanner;


public class cow_barn {

    public static void main(String[] Args)
    {
        Scanner x= new Scanner(System.in);
        int heads=x.nextInt();
        int legs=x.nextInt();

        int men=(4*heads-legs)/2;
        int cow=(legs-2*heads)/2;

        if(cow+men!=heads || men<0 || cow<0)
        {
            System.out.println("Invalid Input");
        }

        else
        {
            System.out.println("Number of Cows: "+cow);
            System.out.println("Number of Men: "+men);
        }
    }
}

