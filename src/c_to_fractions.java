import java.util.*;
public class c_to_fractions{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
        if(x%1==0)
            System.out.println("Input a decimal number");
        else
        {
            String a=""+x;
            String[] splits = a.split("\\.");
            int b=splits[1].length();
            //System.out.println(b);
            int den=(int)Math.pow(10,b);
            //System.out.println(den);
            int num=(int)(x*den);
            //System.out.println(num);
            int gcd=getGcd(num,den);
            //System.out.println(gcd);
            //System.out.println(num/gcd+","+den/gcd);
            String fraction=""+(num/gcd) + "/"+(den/gcd);
            System.out.println("Fraction: "+fraction);
        }
    }
    public static int getGcd(int n1,int n2){
        if(n2==0){
            return n1;
        }
        return getGcd(n2,n1%n2);
    }
}