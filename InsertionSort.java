package DSA;

import java.util.Arrays;

public class InsertionSort { 
    public static void insertionSort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(i> 1 && arr[i]<arr[j-1]){
                int temp= arr[i];
                arr[i]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
        }
    }
    public static void main(String[]args){
    int []arr={10,23,12,45,43,100,65,15,78,87};
    insertionSort(arr);
    System.out.println("Sorted array is : ");
    System.out.println(Arrays.toString(arr));
    
}
}
