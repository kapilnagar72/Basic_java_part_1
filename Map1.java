package CallectionAndMapApi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class Map1 {
    public static void main(String[]args)
    {
        HashMap hm = new HashMap();
        hm.put(01, "kapil");
        hm.put(02, "ram");
        hm.put(03,"ankit");
        System.out.println(hm);

        HashMap hm1 =new HashMap();
        hm1.put("rma", "ram");
        hm1.put("rohit", "raj");
        System.out.println(hm1);

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("ram", "rma");
        lhm.put("rohit", "vijay");
        System.out.println(lhm);

    }
}
