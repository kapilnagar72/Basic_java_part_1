package DSA;

import java.util.*;
import java.util.Map.Entry;

public class HashMapfunction {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // functionality of the put() function

        map.put(2, "rma");
        map.put(4, "kapil");
        map.put(10, "arun");
        map.put(20, "saurabh");
        map.put(215, "rajendra");

        System.out.println("hashmap of the given data :" + map);

        // functionality of get() function
        String result = map.get(20);
        System.out.println("value for the given key is: " + result);

        // functionality of the contionkeys() function
        System.out.println(map.containsKey(10));

        // functinality of the remove () function

        map.remove(1);
        System.out.println("updated the :" + map);

        // iterating using the for loop
        for (Entry<Integer, String> e : map.entrySet()) {
            System.out.println("hashmap is : ");
            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }
}
