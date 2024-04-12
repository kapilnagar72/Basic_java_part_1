package DateTime;
enum Week
{
    MON,THE,WED,THU,FRI,SAT,SUN;
}

public class Enum {
    enum Result
    {
        PASS,FAIL,NR;
    }
    public static void main(String[]args)
    {
       Week w = Week.MON;
       System.out.println(w);

       int index = Week.MON.ordinal();
       System.out.println(index);

       Week[] wk = Week.values();
       for(Week w1: wk)
       {
        System.out.println(w1 +":" + w1.ordinal());
       }


    }
    
}
