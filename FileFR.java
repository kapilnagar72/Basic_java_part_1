package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileFR {
    public static void main(String[]args) throws IOException
    {
        File dir = new File("txt");
        File file = new File(dir, "File.txt");

        FileReader fr = new FileReader(file);
        int i = fr.read();

        while(i!=-1)
        {
            System.out.println(i + "....---....");
            System.out.println((char)i);
            i=fr.read();

        }
    }
}
