package BasicSA;
public class Student2 {
    private String name;
    private int age;
    Student2(String name , int age){
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Test1{
    public static void main(String[]args)
    {
        Student2 st = new Student2("kapil", 18);
        String name = st.getName();
        System.out.println(name);
        int age = st.getAge();
       System.out.println(age);    }
}
