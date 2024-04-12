package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImple {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // To add data inside the queue (enqueue)
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }

        System.out.println("Queue data looks like: " + q);

        // To display the top element present in the queue
        System.out.println("The top most element in the queue: " + q.peek());

        // To remove the element from the queue (dequeue)
        q.remove();

        // To display the top element in the queue after the deletion
        System.out.println("The top most element in the queue after the deletion: " + q.peek());

        // The size of the queue
        System.out.println("The current size of the queue is: " + q.size());
    }
}
