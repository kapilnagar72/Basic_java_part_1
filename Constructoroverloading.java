package BasicSA;
public class Constructoroverloading {
    private String name;
    private int age;
    public Constructoroverloading(){
        System.out.println("Default constructor is called");
        name = "kapil";
        age = 21;
    }
    public Constructoroverloading(String name){
        this.name = name;
        age =20;
    }
    public Constructoroverloading(String name ,int age){
        this.name = name;
        this.age = age;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
    
}
class Ramram {
    public static void main(String[]args){
        Constructoroverloading con1 = new Constructoroverloading();
        con1.disp();
        Constructoroverloading con2 = new Constructoroverloading("Arun");
        con2.disp();
        Constructoroverloading con3 = new Constructoroverloading("Ram");
        con3.disp();
    }
}
