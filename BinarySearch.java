package DSA;
import java.util.*;
import java.io.*;
public class BinarySearch {
    public static int binarySearch(int[]arr, int target){
        int low =0 ,high =arr.length-1;
        while(low<=high){
            int mid =low + (high-low)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] <target){
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
    public static void mian(String[]args){
        Scanner sc = new Scanner(System.in);
        // size of the element fromthe user
        System.out.println(" enter the number of element");
        int n = sc.nextInt();
        // array element entered from thr user
        System.out.println("enter the array element");
        int []array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        // atrget element from the user
        System.out.println(" enter target element");
        int x = sc.nextInt();
        // fanction calling of binary search
        int result = binarySearch(array ,x);
        if (result ==0){
            System.out.println("Search element arenot found the araay");
        }
        else{
            System.out.println("Search element are the found fromthe array loaction");
        }
    }

    
}
