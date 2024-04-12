package DSA;

public class Reserse {
    public static void main(String[] args){
        int []array={2,3,5,6,8,9,12};
        int n= array.length;
        for(int i=0;i<n/2;i++)
        {
            int temp = array[i];
            array[i]=array[n-i-1];
            array[n-i-1]= temp;
        }
        System.out.println("Reverse of array: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]+ " ");
        }
        System.out.println( );
    }
    
}
