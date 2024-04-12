package CallectionAndMapApi;

import java.util.*;

public class Launchal
{
    public static void main (String[]args)
    {
        ArrayList al = new ArrayList();

        al.add(100);
        al.add(300);
        al.add(10);
        System.out.println(al);

        ArrayList al1 = new ArrayList();
        al1.add("kapil");
        al1.add(9.08);
        al1.add("ankit");
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add(123);
        al2.add(234);
        System.out.println(al2);

        al2.add(2,"pw");
        System.out.println(al2);

        al2.add(al2);
        System.out.println(al2);

        al2.add(2,"arun");
        System.out.println(al2);

        al2.add(101.390);
        System.out.println(al2);
        }
    
}
