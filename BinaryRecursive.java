package DSA;

public class BinaryRecursive {
    public static int BinarySearch(int []arr,int low,int high,int x){
        int result =-1;
        while(low<+high){
            int mid =low+(high-low)/2;
            if(arr[mid]==x){
                 return mid;
                   }
            else{
                return BinarySearch(arr,low,high,x);
            }    
        }
        return result;
  }
    public static void main(String[]args){
        int[]arr = {2,3,4,67,5,57,5,87,5,9};
        int low =0;
        int high=arr.length-1;
        int x = 6;
        int result =BinarySearch(arr,low,high,x);
        System.out.println("the array element is at position " + result);
    }
}
