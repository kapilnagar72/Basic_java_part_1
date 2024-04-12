package DSA;
/* 
public class InsertAtBeginningLinked {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insertion of a node at the end
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            // If the linked list is empty, set the new node as the head.
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Append the new node at the end.
        temp.next = newNode;
    }

    // Insertion of a node at the beginning
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Display the linked list
    public void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Add a newline for clarity.
    }

    public static void main(String[] args) {
        InsertAtBeginningLinked llist = new InsertAtBeginningLinked();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);

        System.out.println("Before insertion of 10, 1, and 19");
        llist.displayLL();

        llist.insertAtEnd(10);
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(19);

        System.out.println("After insertion of 10, 1, and 19");
        llist.displayLL();
    }
}

*/