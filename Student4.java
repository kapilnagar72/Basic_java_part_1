package BasicSA;
public class Student4 {
    private String name;
    private int age;
    public Student4(){
        System.out.println("defult construsctor is called");
        name = "kapil";
        age = 18;
    }
    public Student4(String name ,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }

}
class Launch1 {
    public static void main(String[]args){

    }
}
