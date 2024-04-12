package DSA;

import java.util.Scanner;

public class FibonacciSeries {
   
     public static int FibonacciFind(int n){
        int result =0;
        if(n<=1){
            return n;
        }
        else{
        result= FibonacciFind(n-1)+FibonacciFind(n-2);
    }
    return result;
}

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();
        int result = FibonacciFind(n);
        System.out.println("the final output is :" +result);
    }
    
}
