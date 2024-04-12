package DateTime;
import java.util.*;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;
public class LaunchStr {
    public static void main(String[]args)
    {
        List<Integer> list = Arrays.asList(23,43,45,34,34,46,56);
        Stream<Integer> StreamData=list.stream();
        StreamData.forEach(n -> System.out.println(n));
    }
    
}
