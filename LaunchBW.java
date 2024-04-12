package IO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class LaunchBW {
    public static void main(String[]args) throws IOException
    {
      File dir = new File("txt");
      File file = new File(dir,"File.txt");

      FileWriter fw = new FileWriter(file,true);
      BufferedWriter bw = new BufferedWriter(fw);

      bw.write("kapil");
      bw.newLine();
      bw.write(130);
      bw.newLine();
      bw.write(84);
      bw.newLine();
      char ch[]= {'e','d','a','z','g','h'};
      bw.write(ch);

      //bw.close(); // close() use karne par file me data add nhi hota he
      bw.flush();    // flush() me data/info add kar sakte he
    }
}