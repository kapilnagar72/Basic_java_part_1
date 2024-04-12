package BasicSA;
public class Array2 {
    public static void main(String[] args)
    {
        int num [][] = {{10,23,45,67},
    {56,45,78,90},
    {12,34,56,78},
    {56,45,67,89}};
    for (int i=0; i<=3; i++)
    {
        for (int j=0; j<=3; j++)
        {
            System.out.print(num[i][j]+ " ");
    }
    
    System.out.println(num);
}
}
}