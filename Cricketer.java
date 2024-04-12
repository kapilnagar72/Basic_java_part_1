package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cricketer implements Serializable
 {
    private String name;
    private int age;
    private int runs;
    public Cricketer(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
    public void disp() {
    }
}

class LaunchS{
    public static void main(String[]args) throws IOException
    {
        Cricketer c= new Cricketer("rohit", 34, 10000);
    
        FileOutputStream fos=new FileOutputStream("File.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();
    }

}
