package DSA;
import java.util.Scanner;

public class PowerOfElement {
    public static int powerOfElement(int a, int b) {
        if (b == 0) {
            return 1; // Anything raised to the power of 0 is 1
        } else if (b == 1) {
            return a; // Base case: a^1 = a
        } else {
            int mid = b / 2;
            int result = powerOfElement(a, mid);
            int finalResult = result * result;
            if (b % 2 == 0) {
                return finalResult;
            } else {
                return a * finalResult;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = powerOfElement(a, b);

        System.out.println("Power of " + a + " raised to " + b + " is: " + result);
    }
}
