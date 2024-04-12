package BasicSA;
public class Conditionals
{
    public static void main (String[] args){
        int age = 55;
        if (age == 18){
            System.out.println(" legal adult");
        }
        else if (age <= 60) {
            System.out.println("not eligible") ;
        }
        else  {
            System.out.println("kids");
        }

    }
}