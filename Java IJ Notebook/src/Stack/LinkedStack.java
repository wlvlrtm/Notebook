package Stack;

import Stack.Stack;

public class LinkedStack implements Stack {
    private class Node {
        String data;    // data field
        Node link;      // link field

        public Node() {
            this.data = null;
            this.link = null;
        }
    }


    private Node top;
    private int len;


    @Override
    public boolean isEmpty() {  // 스택의 공백 여부 검사; Check whether stack is Empty or not.
        return (this.top == null);
    }


    @Override
    public void push(String item) { // 스택의 top에 원소 삽입; Push a new Item on top of the Stack.Stack.
        Node node = new Node(); // Create a new Node.

        node.data = item;       // data filed set.
        node.link = this.top;   // link filed set.

        this.top = node;        // top set.

        //System.out.println("Pushed Item: " + item);
        this.len ++;
    }


    @Override
    public void delete() {  // 스택의 top에 있는 원소 삭제; Delete an Item on top of the Stack.Stack.
        if (isEmpty()) {    // if Stack.Stack is Empty,
            System.out.println("// STACK IS EMPTY //");
        }
        else {
            this.top = this.top.link;   // Change start point of top.
            this.len --;
        }

    }


    @Override
    public String pop() {   // 스택의 top에 있는 원소 삭제 및 반환; Delete an Item on top of the Stack.Stack and return it.
        if (isEmpty()) {    // if Stack.Stack is Empty
            return "// STACK IS EMPTY //";
        }
        else {
            String temp = this.top.data;    // save a node to return.
            this.top = this.top.link;   // node delete.
            this.len --;
            return temp;    // node return.
        }
    }


    @Override
    public String peek() {  // 스택의 top에 있는 원소 반환; return an Item on top of the Stack.Stack.
        if (isEmpty()) {    // if Stack.Stack is Empty
            return "// STACK IS EMPTY //";
        }
        else {
            return this.top.data;   // Item return.
        }
    }

    @Override
    public int size() { // 스택의 크기 반환; Return Size of Stack.Stack.
        return this.len;
    }


    @Override
    public String toString() {
        String result = "";

        if (isEmpty()) {
            result = "// STACK IS EMPTY //";
        }
        else {
            Node temp = this.top;
            result += "[" + temp.data;
            temp = temp.link;

            while(temp != null) {
                result += ", " + temp.data;
                temp = temp.link;
            }

            result += "]";
        }
        return result + ", len: " + this.len;
    }
}
