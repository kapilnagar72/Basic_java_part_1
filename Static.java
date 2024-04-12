package absttract;

public class Static {
    
    public void show()
    {
        System.out.println("in show");
    }
    static class B
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}

class InnerDemo
{
    public static void main (String[]args)
    {
      //A obj = new A(); 
        A.B obj = new A.B();
        obj.show();
        obj.display();
   }
}
