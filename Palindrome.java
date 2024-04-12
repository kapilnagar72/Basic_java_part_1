package DSA;

public class Palindrome {
    private static int flag;

    public static void main(String[]args)
    {
        int []array= {1,2,6,2,1};
        int n=array.length;
        for (int i=0; i<n/2;i++)
        {
            if (array[i]!=array[n-i-1])
            {
                flag=1;
                System.out.println("not a palindrome array");
                break;
            }
        }
        if (flag==0) {
            System.out.println("this is palindrome array");
        }
    }
    
}
