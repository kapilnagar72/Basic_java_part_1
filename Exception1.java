package absttract;
class MyException extends Exception
{
    public MyException()
    { 

    }
    public MyException (String msg)
    {
        super(msg);
    }
}
public class Exception1 {
    public static void main(String[]args)
    {
        float num1 = 7;    // int num1 = 6;
        float num2 = 0;    // int num2 = 0;
        try 
        {
            if (num2<0)
            {
                Exception e = new MyException(" Nagetive Number");
                throw e;

            }
            else 
            {
                float result =  num1/num2; //use in int place of float
                System.out.println(result);
            }
        }
        catch(Exception e)
        {
            System.out.println(" enter the valid number" + e);
        }
    }
}
