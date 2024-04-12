package DSA;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size of array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Array elements
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Target value
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        // Create a HashMap to store the elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        // Main logic of the Two Sum problem
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(arr[i], i);
        }

        // Display the result
        if (result[0] != result[1]) {
            System.out.println("The resultant array indices are [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
