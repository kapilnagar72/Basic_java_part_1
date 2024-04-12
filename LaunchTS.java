package CallectionAndMapApi;

import java.util.TreeSet;

public class LaunchTS {
    public static void main(String[]args)
    {
        TreeSet ts = new TreeSet(); // tree set 
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));

        System.out.println(ts.ceiling(050));
        System.out.println(ts.floor(20));

        ts.add(250);
        System.out.println(ts);

    }
}
