import java.text.DecimalFormat;
import java.util.Scanner;

public class c_to_f {
    public static void main(String[] Args)
    {
        DecimalFormat df=new DecimalFormat("#.0");
        Scanner x=new Scanner(System.in);
        int c=x.nextInt();
        double f=(9.0/5.0)*(c)+32;
        //f=Math.round(f*10)/10.0;
        System.out.println(df.format(f));
    }
}
