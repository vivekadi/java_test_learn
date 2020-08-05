import java.util.Scanner;

public class rep_number {
    public static void main(String[] Args)
    {
        int count=0;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=x.nextInt();
        System.out.println("Enter the key ");
        int key=x.nextInt();

        int num_temp=num;
        while(num!=0)
        {
            int b=num%10;
            if(b==key)
            {
                count++;
            }
            num/=10;
        }

        System.out.println(key+" appears "+count+" times in "+num_temp);
    }

}
