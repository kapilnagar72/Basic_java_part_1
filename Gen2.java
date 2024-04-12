package IO;

import java.util.ArrayList;
import java.util.Collections;

public class Gen2 {
    
    private static final String Collation = null;

    public static void main(String []args)
    {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(40);
        al.add(109);
        al.add(300);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList<String> al2= new ArrayList<String>();
        al2.add("kapil");
        al2.add("nagar");
        al2.add("java");
        al2.add("developer");
        al2.add("one cr");
        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(10);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(50);
        System.out.println(al3);

        int index = Collections.binarySearch(al3,50);
        System.out.println(index);

        Collections.reverse(al3);
        System.out.println(al3);

        Collections.rotate(al3,3);
        System.out.println(al3);

        System.out.println(Collections.frequency(al3, 20));

    }
}
