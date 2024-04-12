package CallectionAndMapApi;
import java.util.*;
public class LaunchAD {
    
    public static void main(String[]args)
    {
        ArrayDeque ad = new ArrayDeque();
        ad.add(100);
        ad.add(200);
        ad.add(200);
        System.out.println(ad);

        ad.addFirst(12);
        ad.addLast(34);
        System.out.println(ad);

        ad.add("kapil");
        System.out.println(ad);

        ad.offer(56);
        ad.offer("j");
        ad.offer(95);
        System.out.println(ad);
    }
}
