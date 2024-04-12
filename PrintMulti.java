package DSA;

public class PrintMulti {
    public static void Printmulti(int n ,int k){
        if (k==1){
            System.out.println(n);
            return;
        }
        Printmulti(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[]args){
        int n =21;
        int k =10;
        Printmulti(n,k);
        System.out.println();
    }
}
