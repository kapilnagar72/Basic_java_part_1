package IO;
/* 
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Cricketer2 implements Serializable
 {
    
    private String name;
    private int age;
    private int runs;
    public Cricketer2(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
        
    }
}

class LaunchSS{
    public static void main(String[]args) 
    {
        //Cricketer c= new Cricketer("rohit", 34, 10000);

        FileInputStream fis=new FileInputStream("File.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Cricketer cr = (Cricketer) ois.readObject();

        cr.disp();
       ois.close();
    }
}

*/