package DSA;

import java.util.Scanner;

public class AlternateSum {      // not proper work the code o/p are wrong provided
    public static int Alternatesum(int n){

        if(n==0){
            return 0;
        }
        if(n%2==0){
            return Alternatesum(n-1)-n;
        }
        else{
            return Alternatesum(n-1)+n;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int result = Alternatesum(n);
        System.out.println("the alternate sum series :" + result);
    }
}
