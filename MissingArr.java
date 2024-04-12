package DSA;

public class MissingArr {
    public static void main(String[]args){
        int [] arr = {1,2,3,4,6,8,7};
        int n= arr.length;

        int sum =((n+1)*(n+2))/2;
        // sum current element present
        for(int i=0;i<n;i++){
            sum += arr[i]; 
        }
        int MissingArr =0;
        MissingArr = sum;
        System.out.println("missing element in array: " + MissingArr);
    }
    
}


