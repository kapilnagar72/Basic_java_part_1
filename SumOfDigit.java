package DSA;

import java.util.Scanner;

public class SumOfDigit {
    public static int SumofDigit(int n){
        if(n==0){
            return 0;
        }
        
            return(n%10) +SumofDigit(n/10);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int result=SumofDigit(n);
        System.out.println("the sum of gives digit :" + result);
    }
}
