package DSA;

import java.util.Stack;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IntroductionSatck {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        // push the element inside the stack

        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);

        System.out.println(stack1);

        // print the top most element in stack

        System.out.println(" the top most element before deletion :" + stack1.peek());

        // delete the top most elemnt
        stack1.pop();

        // top most element after deletion
        System.out.println("top most element after deletion: " + stack1.peek());
        // search element
        // search element are not present in gives stack output are -9

        System.out.println("element first is present of the position: " + stack1.search(1));

        // check the stack is empty or not empty
        // empty function returns the boolean value true / false

        System.out.println("in stack empty or not :" + stack1.empty());

    }
}
