package DSA;

import java.util.*;

public class SlidingWindow {
    public static int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<Integer>();
        for (int i = 0; i < a.length; i++) {
            // remove number out of the range k
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            // remove smaller number in k range is they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            // q contains index r contains context
            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 8, 3, 2, 5, 6 };
        int n = 8;
        int k = 3;
        int[] res = new int[n - k + 1];
        res = maxSlidingWindow(arr, k);
        System.out.println("the deserid output is :");
        for (int i = 0; i < n - k + 1; i++) {
            System.out.println(res[i] + " ");
        }
    }
}
