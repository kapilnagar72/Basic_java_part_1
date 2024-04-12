package BasicSA;
import java.util.Scanner;
class Farmer{
    int pa;
    float td =12;
    float ri ;
    float si;
    void input(){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Please enter the loan amount reqiured");
            pa = s.nextInt();
            System.out.println("Please enter the loan amount reqiured");
            td = s.nextFloat();
        }
        ri =4.5f;

    }
    void compute(){
        si = (pa*td*ri)/100;
    }
    void disp(){
        System.out.println("SI is :" + si);
    }
}
class Launch{
    public static void main(String[]args){
        Farmer f1 =new Farmer();
        Farmer f2 =new Farmer();
        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();
    }
}
