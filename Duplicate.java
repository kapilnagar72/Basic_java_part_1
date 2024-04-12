package DSA;

public class Duplicate {
    public static void main(String[]args){
        int []arr = {2,3,3,5};
        int n =arr.length;
       // System.out.println(n);

        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]== arr[i]){
                    System.out.println("Duplicate element found is : " + arr[i]);
                }
            }
        }
    }
    
}

