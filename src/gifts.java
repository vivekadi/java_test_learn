import java.util.*;
import java.util.stream.Collectors;

public class gifts {
    public static void main(String[] Args)
    {
        String buf= "";
        String buf1= "";
        String buf2= "";
        int i=0;
        Scanner x=new Scanner(System.in);
        Map<Integer,List<String>> sales=new HashMap<Integer,List<String> >();
        List<String> name = new ArrayList<String>();
        List<String> harry_l = new ArrayList<String>();
        List<String> leo_l = new ArrayList<String>();
        List<String> james_l = new ArrayList<String>();

        System.out.println("Enter the number of boxes sold by Sara");
        int sara=x.nextInt();
        name.add("Sara");
        sales.put(sara,name);

        System.out.println("Enter the number of boxes sold by Harry");
        int harry=x.nextInt();
        if(harry==sara)
            name.add("Harry");
        else
        {
            harry_l.add("Harry");
            sales.put(harry,harry_l);
        }

        System.out.println("Enter the number of boxes sold by Leo");
        int leo=x.nextInt();
        if(leo==sara)
            name.add("Leo");
        else if (leo == harry)
            harry_l.add("Leo");
        else
        {
            leo_l.add("Leo");
            sales.put(leo,leo_l);
        }

        System.out.println("Enter the number of boxes sold by James");
        int james=x.nextInt();

        if(james==sara)
            name.add("James");
        else if (james==harry)
            harry_l.add("James");
        else if (james==leo)
            leo_l.add("James");
        else
        {
            james_l.add("James");
            sales.put(james,james_l);
        }

        int largest=Math.max(sara,Math.max(harry,Math.max(leo,james)));
        for (String e:sales.get(largest))
        {
            i++;
            if(i==1)
                buf+=e;
            else if(i==2)
                buf1+=e;
            else if(i==3)
                buf2+=e;
        }

        switch (i)
        {
            case 1: System.out.println(buf+" receives the gifts.");break;
            case 2: System.out.println(buf+" and "+buf1+" receive the gifts.");break;
            case 3: System.out.println(buf+", "+buf1+" and "+buf2+" receive the gifts.");break;
            case 4: System.out.println("All get the same gifts.");break;
        }
    }
}
