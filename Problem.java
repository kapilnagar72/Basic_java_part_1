package BasicSA;
public class Problem {
    static int a;
    static int b;
    int m;
    int n;
    static{
        System.out.println("control is static block");
        a=20;
        b=21;

    }
    {
        System.out.println("control in non-static block");
        m=30;
        n=40;
    }
    static void disp1(){
        System.out.println("value of static var a:" +a);
        System.out.println("value of static var b:" +b);
    }
    void disp2(){
        System.out.println("value of non-static var m:" +m);
        System.out.println("value of non-static var n:" +n);
    }
}
class Launch4{
    public static void main(String[]args){
        Problem p= new Problem();
        Problem.disp1();
        p.disp2();
    }
}
