import java.util.*;

public class num_month {
    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        Dictionary<Integer,String> month=new Hashtable<Integer, String>();
        month.put(1,"January");
        month.put(2,"February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May");
        month.put(6,"June");
        month.put(7,"July");
        month.put(8,"August");
        month.put(9,"September");
        month.put(10,"October");
        month.put(11,"November");
        month.put(12,"December");

//        for(Enumeration k=month.keys();k.hasMoreElements();)
//        {
//            System.out.print(k.nextElement()+"\t");
//        }

        int a=x.nextInt();
        if(a>0 && a<13)
        {
            System.out.println(month.get(a));
        }
        else
        {
            System.out.println("No month for the number "+a);
        }

    }
}
