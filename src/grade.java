import java.util.*;

public class grade {
    public static void main(String[] Args)
    {
        double g1=0.0;
        Scanner x=new Scanner(System.in);
        Map<Double, String> map=new HashMap<Double, String>();
        map.put(5.0,"O");
        map.put(4.5,"A");
        map.put(4.0,"B");
        map.put(3.0,"C");
        map.put(2.0,"D");
        map.put(1.0,"E");
        map.put(0.0,"F");

        System.out.println("Enter the grade point: ");
        double grade=x.nextDouble();
        if(grade==5)
            g1=5;
        else if(grade<5 && grade>=4.5)
            g1=4.5;
        else if(grade<4.5 && grade>=4.0)
            g1=4.0;
        else if(grade<4.0 && grade>=3.0)
            g1=3.0;
        else if(grade<3.0 && grade>=2.0)
            g1=2.0;
        else if(grade<2.0 && grade>=1.0)
            g1=1.0;
        else if(grade<1.0 && grade>=0.0)
            g1=0.0;

        System.out.println("Grade: "+map.get(g1));


    }
}
