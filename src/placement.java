import java.util.Scanner;

public class placement {
    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int cse=x.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ece=x.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int mechanical=x.nextInt();



        if (cse < 0 || ece<0 || mechanical<0) {
            System.out.println("Input is Invalid ");
        }

        else if(cse==ece && ece==mechanical)
        {
            System.out.println("None of the department has got the highest placement");
        }

        else{

            if (cse >= ece && cse >= mechanical)
            {
                System.out.println("Highest Placement");
                System.out.println("CSE");

                if (cse == ece) {
                    System.out.println("ECE");
                }

                if (cse == mechanical) {
                    System.out.println("MECH");
                }
            }
            else if (ece >= cse && ece >= mechanical)
            {
                System.out.println("Highest Placement");
                System.out.println("ECE");

                if (ece == mechanical)
                {
                    System.out.println("MECH");
                }
            }
            else
                {
                System.out.println("Highest Placement");
                System.out.println("MECH");
            }
        }
    }
}