import java.util.Scanner;
import java.util.*;

public class rainbow {
        public static void main(String[] Args)
        {
            Scanner x=new Scanner(System.in);

            System.out.println("Enter the first letter:");
            String a=x.nextLine();
            System.out.println("Enter the second letter:");
            String b=x.nextLine();
            System.out.println("Enter the third letter:");
            String c=x.nextLine();
            System.out.println("Enter the fourth letter:");
            String d=x.nextLine();
            System.out.println("Enter the fifth letter:");
            String e=x.nextLine();
            System.out.println("Enter the sixth letter:");
            String f=x.nextLine();
            System.out.println("Enter the seventh letter:");
            String g=x.nextLine();

            if(a.equals("R") && b.equals("A") && c.equals("I") && d.equals("N") && e.equals("B") && f.equals("O") && g.equals("W"))
                System.out.println(a+b+c+d+e+f+g);
            else
                System.out.println("The spelling is wrong");


        }
}
