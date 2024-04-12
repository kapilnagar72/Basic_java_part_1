package absttract;

import absttract.A.B;

// program1

//abstract class a
//{
  //  abstract void show();
//}
/* 
interface A 
{
    int num = 5;
    void show();
}
class Do
{
    public static void main(String[]args)
    {
    System.out.println(A.num);
    }
}
*/

//program2

/* 
interface A 
{
    void show();
}
interface X
{
    void abc();
}
class B implements A,X
{
    public void show()
    {
        System.out.println(" in show");
    }
    public void abc()
    {
        System.out.println(" in abc");
    }

}
class Dem
{
    public static void main(String[]args)
    {
        B obj = new B();
        obj.show();
        obj.show();
    }
}
*/

interface A 
{
    void show();
    default void config()
    {
        System.out.println(" in config");
    }
    static void abc()
    {
        System.out.println("in abxc");
    }
class B implements A
    {
        public void show()
        {
            System.out.println("in show");
        }

        public void display() {
        }
    }
}
class Dem
{
    public static void main(String[]args)
    {
        A.abc();
        B obj= new B();
        obj.show();
        obj.config();
    }
}