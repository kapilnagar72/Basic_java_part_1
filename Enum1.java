package DateTime;
enum Result
{
    PASS,FAIL,NR;
    int marks;
    Result ()
    {
        System.out.println("constructor is enum");
    }
    void setmarks(int marks)
    {
        this.marks=marks;
    }
    public int getmarks() {
        return 0;
    }
}
public class Enum1 {
    public static void main(String[]args)
    {   
        Result.PASS.setmarks(56);
        int m1=Result.PASS.getmarks();
        System.out.println(m1);

        int m2=Result.FAIL.getmarks();
        System.out.println(m2);

        Result.NR.setmarks(m2);
        int m3= Result.NR.getmarks();
        System.out.println(m3);

    }
    
}
