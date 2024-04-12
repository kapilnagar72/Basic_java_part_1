package DSA;

import java.util.*;

public class Dedue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(5);
        deque.addLast(7);
        deque.addLast(9);

        System.out.println("deque output looks like: " + deque);
        deque.removeFirst();
        System.out.println("deque output loks after detetion: " + deque);
    }
}
