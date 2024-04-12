package BasicSA;
public class Array4 {
    public static void main(String[]args)
    {
        int num[][] = {{23,56,89,05,45},
    {4,56},
{56,45,34,67},
{6,7,8},
{1}};

// Enhanched for loop    / or for each  
for (int a[] : num)
{
    for ( int b : a )
    {
System.out.print( b +" ");
    }
    System.out.println();
    
}
}
}