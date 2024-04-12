package BasicSA;
// Encapsulation
public class Student {
    private int age;
    private String name;
    public void setData1(int age)
    {
        this.age = age;
    }
    public boolean setData2(String name)
    {
        this.name = name;
        return false;
    }
    public void show()
    {
        System.out.println(name + " " + age);
    }
    
}

class demo
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setData1(25);
        obj.setData1(78);
        obj1.setData2("pooja");
        obj1.setData2("soarabha");

        obj.show();
        obj1.show();
    }
}