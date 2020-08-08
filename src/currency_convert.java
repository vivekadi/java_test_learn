import java.text.DecimalFormat;
import java.util.*;


public class currency_convert {
    public static void main(String[] Args)
    {
        Scanner x=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        Map<String,Double> curr=new HashMap<String, Double>();
        curr.put("HKD",8.86);
        curr.put("SGD",51.29);
        curr.put("USD",69.55);
        curr.put("CAD",52.08);

        Map<String, String> maps=new HashMap<String, String>();
        maps.put("HKD","Hong Kong");
        maps.put("SGD","Singapore");
        maps.put("USD","USA");
        maps.put("CAD","Canada");

        System.out.println("Enter the currency code");
        String country=x.nextLine();

        if(maps.containsKey(country))
        {
            String country_name=maps.get(country);
            System.out.println("Enter the amount");
            int amount=x.nextInt();

            double total=amount*(curr.get(country));

            System.out.println(country_name+" dollar "+amount+" equals to "+df.format(total)+" Indian Rupee ");
        }

        else
            System.out.println("Currency code not found");

    }

}
