package CallectionAndMapApi;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHS {
    public static void main (String[]ardf)
    {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(200);      //  o/p are the diffrent gives values
        hs.add(150);
        hs.add(50);
        System.out.println(hs);

        LinkedHashSet lh = new LinkedHashSet();
        lh.add(100);
        lh.add(200);      // o/p are the same as gives value  [100,200,150,50]
        lh.add(150);
        lh.add(50);
        System.out.println(lh);
    }
    
}
