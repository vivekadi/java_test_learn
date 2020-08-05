import java.util.*;

public class seasons {
    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        Dictionary<Integer,String> month=new Hashtable<Integer, String>();
        month.put(1,"Winter");
        month.put(2,"Winter");
        month.put(3,"Spring");
        month.put(4,"Spring");
        month.put(5,"Spring");
        month.put(6,"Summer");
        month.put(7,"Summer");
        month.put(8,"Summer");
        month.put(9,"Autumn");
        month.put(10,"Autumn");
        month.put(11,"Autumn");
        month.put(12,"Winter");

//        for(Enumeration k=month.keys();k.hasMoreElements();)
//        {
//            System.out.print(k.nextElement()+"\t");
//        }

        System.out.println("Enter the month:");
        int a=x.nextInt();
        if(a>0 && a<13)
        {
            System.out.println("Season:"+month.get(a));
        }
        else
        {
            System.out.println("Invalid month");
        }

    }
}
