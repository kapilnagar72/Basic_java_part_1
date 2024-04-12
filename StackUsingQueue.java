package DSA;
// Implementation of stack data structure using queue

// time complexity add: O(n)
// time complexity remove: O(1)
// space complexity: O(n)

import java.util.*;
import java.util.LinkedList;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // add an element in the stack
    // time complexity: O(n)
    static void add(int data) {
        // 1. Move all the data elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }

        // 2. Insert the new data in q1
        q1.add(data);

        // 3. Move back all the data elements from q2 to q
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    // to remove the elements from the stack
    // time complexity: O(1)
    static int remove() {
        if (q1.isEmpty()) {
            System.out.println("Stack underflow");
            System.exit(0);
        }

        int ele = q1.peek();
        q1.poll();
        return ele;

    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        // push operation in the stack
        s.add(2);
        s.add(5);
        s.add(7);
        s.add(10);

        // pop the element from the stack
        System.out.println("Deleted element is: " + s.remove());
        System.out.println("Deleted element is: " + s.remove());

    }
}
