package Stack;

public class ArrayStack implements Stack {
    private int top;        // Stack.Stack's top
    private int size;       // Stack.Stack's size
    private String[] arr;   // Array; Stack.Stack

    public ArrayStack(int size) {
        this.top = -1;
        this.size = size;   // set size of Stack.Stack.
        this.arr = new String[this.size];
    }

    @Override
    public boolean isEmpty() {  // 스택의 공백 여부 검사; Check whether stack is Empty or not.
        return (this.top == -1);    // return whether top is -1(empty) or not.
    }

    @Override
    public void push(String item) { // 스택의 top에 원소 삽입; Push a new Item on top of the Stack.Stack.
        this.top += 1;          // top++
        if (this.top >= this.size) {  // OVERFLOW!
            System.out.println("// OVERFLOW //");
        }
        else {  // add a new Item.
            arr[this.top] = item;
        }
    }

    @Override
    public void delete() {  // 스택의 top에 있는 원소 삭제; Delete an Item on top of the Stack.Stack.
        if(isEmpty()) { // stack is empty.
            System.out.println("// STACK IS EMPTY //");
        }
        else {  // Delete an Item.
            this.top -= 1;
            this.size -= 1;
        }
    }

    @Override
    public String pop() {   // 스택의 top에 있는 원소 삭제 및 반환; Delete an Item on top of the Stack.Stack and return it.
        if (isEmpty()) {    // stack is empty.
            return "// STACK IS EMPTY //";
        }
        else {
            return arr[this.top--];   // return an Item and Delete it.
        }
    }

    @Override
    public String peek() {  // 스택의 top에 있는 원소 반환; return an Item on top of the Stack.Stack.
        if(isEmpty()) { // stack is empty.
            return "// STACK IS EMPTY //";
        }
        else {
            return arr[this.top];   // return an Item.
        }
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String result = "";

        if (isEmpty()) {
            result = "// STACK IS EMPTY //";
        }
        else {
            result += "[";
            for (int i = 0; i <= this.top; i++) {
                result += arr[i];
                if (i < this.top) {
                    result += ", ";
                }
            }
            result += "]";
        }
        return result;
    }
}