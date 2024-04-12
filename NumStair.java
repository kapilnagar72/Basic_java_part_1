package DSA;

import java.util.Scanner;

public class NumStair {
    public static int countNum(int n){
    
        int result = 0;
        if(n<=1){
            return n;
        }
        else{
            result = countNum(n-1)+ countNum(n-2);
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of Stair : ");
        int n =sc.nextInt();
        int  result = countNum(n+1);
        System.out.println("number of ways is: "+ result);

    }
}
