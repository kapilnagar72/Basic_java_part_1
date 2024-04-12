package DSA;
//Approach : modified binary search
//tc :O(logn)
//sc : 0(1)

// code is not proper work

import java.util.*;
public class SquareRoot {
    public static int findSqaureroot(int num){
        int low=0, high = num ,result =-1;
        
        while(low<=high){
            int mid =low(high-low)/2;
            long val = mid*mid;
            if(val==num){
                return mid;
            }
            else if (val<num){
                result = mid;
                low =mid +1;
            }
            else {
                high = mid -1;
            }
        }
        return result;
    }
    private static int low(int i) {
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of which you want to sqaure root");
        int num =sc.nextInt();
        //Faunction calling
        int result = findSqaureroot(num);
        System.out.println("Sqaure root of given num : " + result);
    }
    
}
