package CallectionAndMapApi;

import java.util.PriorityQueue;

public class LaunchPQ {
    public static void main(String[]args)
    {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        
        System.out.println(pq);  // cbt
        //pq.add("jk");
        // difference type object are not allowwd
        pq.add(30);
        System.out.println(pq);

    }
}
