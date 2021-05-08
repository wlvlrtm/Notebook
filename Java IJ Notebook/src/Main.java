import Tree.LinkedTree;
import Tree.Node;

public class Main {
    public static void main(String[] args) {
        // LinkedList
        /*
        LinkedList linkedList = new LinkedList();

        linkedList.InsertFirstNode("2");
        linkedList.InsertFirstNode("1");

        linkedList.InsertMiddleNode("2", "3");

        linkedList.InsertLastNode("4");

        System.out.println(linkedList);

        linkedList.DeleteNode("2");

        System.out.println(linkedList);
         */


        // Array Stack.Stack Test
        /*
        Stack.ArrayStack stack = new Stack.ArrayStack(3);

        System.out.println("stack.peek: " + stack.peek());

        stack.push("A");
        System.out.println(stack);

        System.out.println("stack.peek: " + stack.peek());

        stack.push("B");
        System.out.println(stack);

        System.out.println("stack.peek: " + stack.peek());

        stack.push("C");
        System.out.println(stack);

        System.out.println("stack.peek: " + stack.peek());

        stack.pop();
        System.out.println(stack);

        System.out.println("stack.peek: " + stack.peek());

        stack.pop();
        System.out.println(stack);

        System.out.println("stack.peek: " + stack.peek());
         */


        // Linked Stack.Stack Test
        /*
        Stack.LinkedStack linkedStack = new Stack.LinkedStack();

        linkedStack.push("D");
        System.out.println(linkedStack);

        linkedStack.push("E");
        System.out.println(linkedStack);

        linkedStack.push("F");
        System.out.println(linkedStack);

        linkedStack.pop();
        System.out.println(linkedStack);

        linkedStack.pop();
        System.out.println(linkedStack);
         */


        // Make Reverse String for using Stack.Stack
        /*
        String str = "ABCD";

        Stack.LinkedStack linkedStack = new Stack.LinkedStack();

        int i = 0;
        while (i < str.length()) {
            linkedStack.push(str.substring(i, i+1));
            i++;
        }

        String result = "";

        while(!linkedStack.isEmpty()) {
            result += linkedStack.pop();
        }

        System.out.println("Reverse result: " + result);
         */


        // Check for Pairs of Parentheses
        /*
        String exp = "[{(1 + 2) * (3 - 1)} / 5]";
        TestPair testPair = new TestPair();

        System.out.println("Is Pair: " + testPair.PairCheck(exp));
        System.out.println(testPair);
         */


        // Infix Notation to Postfix Notation
        /*
        String exp = "(10 + 55) * (54 / 13) - 3";
        FixChange fixChange = new FixChange();

        System.out.println(fixChange.ChangeToPostfix(exp));
         */


        // Calculate of Postfix Notation
        /*
        String exp1 = "10 20 +";
        String exp2 = "100 20 - 30 - 40 + 50 -";
        String exp3 = "1 2 3 4 5 6 7 8 9 10 + + + + + + + + +";
        String exp4 = "10 20 30 +";
        String exp5 = "10 20 + -";
        String exp6 = "10 20 $";

        FixChange fixChange = new FixChange();

        fixChange.EvalPostFix(exp1);
        fixChange.EvalPostFix(exp2);
        fixChange.EvalPostFix(exp3);
        fixChange.EvalPostFix(exp4);
        fixChange.EvalPostFix(exp5);
        fixChange.EvalPostFix(exp6);
         */


        // Queue.ArrayQueue Test
        /*
        Queue.ArrayQueue arrayQueue = new Queue.ArrayQueue(5);

        arrayQueue.EnQueue("1");
        arrayQueue.EnQueue("2");
        arrayQueue.EnQueue("3");
        arrayQueue.EnQueue("4");
        arrayQueue.EnQueue("5");

        System.out.println(arrayQueue);

        System.out.println("Del: " + arrayQueue.DeQueue());

        System.out.println(arrayQueue);

        System.out.println("peek: " + arrayQueue.peek());
         */


        // Queue.LinkedQueue Test
        /*
        Queue.LinkedQueue linkedQueue = new Queue.LinkedQueue();

        System.out.println(linkedQueue.EnQueue("1"));
        System.out.println(linkedQueue.EnQueue("2"));
        System.out.println(linkedQueue.EnQueue("3"));
        System.out.println(linkedQueue.EnQueue("4"));
        System.out.println(linkedQueue.EnQueue("5"));

        System.out.println(linkedQueue);

        System.out.println(linkedQueue.peek());

        System.out.println(linkedQueue.DeQueue());

        System.out.println(linkedQueue.peek());

        System.out.println(linkedQueue);

        System.out.println(linkedQueue.DeQueue());
        System.out.println(linkedQueue.DeQueue());
        System.out.println(linkedQueue.DeQueue());
        System.out.println(linkedQueue.DeQueue());

        System.out.println(linkedQueue.DeQueue());

        System.out.println(linkedQueue);
         */

        //

        LinkedTree T = new LinkedTree();

        Node node7 = T.MakeBT(null, "D", null);
        Node node6 = T.MakeBT(null, "C", null);
        Node node5 = T.MakeBT(null, "B", null);
        Node node4 = T.MakeBT(null, "A", null);

        Node node3 = T.MakeBT(node6, "/", node7);
        Node node2 = T.MakeBT(node4, "*", node5);
        Node node1 = T.MakeBT(node2, "-", node3);


        System.out.println(node1);
        System.out.println();

        T.PreOrder(node1);
        System.out.println();

        T.InOrder(node1);
        System.out.println();

        T.PostOrder(node1);
        System.out.println();

        System.out.println();

        T.AddBT("E", node7, node1);
        T.AddBT("E2", node7, node1);

        T.PreOrder(node1);
        System.out.println();

        System.out.println(node1);
    }
}