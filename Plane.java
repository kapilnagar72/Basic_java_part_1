package DateTime;
//Function interface
@FunctionalInterface
interface Demo
{
    void disp();
    //void disp();
}
//this is parent class
@Deprecated
public class Plane {
    public void planeFliesAtGoodHeight()
    {
     System.out.println("plane is flying");
    }
    
}
 // this is child class orsubclass
 class Cargoplane extends Plane
 {
    //overriden method from parent class
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println("cargoplane flies low");
    }
 }