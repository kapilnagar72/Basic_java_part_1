package DSA;
import java.util.*;
import java.util.Scanner;

public class LowerBound {
     public static int findFirstOccurence(int[]arr, int target){
        int low =0 ,high =arr.length-1;
        int result =-1;
        while(low<=high){
            //avoid overflow
            int mid =low + (high-low)/2;
            if (arr[mid] == target){
                result =mid;
                high=mid -1;
            }
            else if (arr[mid] <target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void mian(String[]args){
        Scanner sc = new Scanner(System.in);
        // size of the element fromthe user
        System.out.println(" enter the number of element");
        int n = sc.nextInt();
        System.out.println("enter the array element");
        int []array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        // atrget element from the user
        System.out.println(" enter target element");
        int x = sc.nextInt();
        // fanction calling of binary search
        int result = findFirstOccurence(array, x);
        if (result ==-1){
            System.out.println("Search element arenot found the araay");
        }
        else{
            System.out.println("Search element are the found fromthe array loaction");
        }
    }

    
}

