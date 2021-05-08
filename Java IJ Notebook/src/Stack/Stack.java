package Stack;

public interface Stack {
    boolean isEmpty();      // 스택의 공백 여부 검사; Check whether stack is Empty or not.
    void push(String item); // 스택의 top에 원소 삽입; Push a new Item on top of the Stack.Stack.
    void delete();          // 스택의 top에 있는 원소 삭제; Delete an Item on top of the Stack.Stack.
    int size();             // 스택의 크기 반환;   Return Size of Stack.Stack.
    String pop();           // 스택의 top에 있는 원소 삭제 및 반환; Delete an Item on top of the Stack.Stack and return it.
    String peek();          // 스택의 top에 있는 원소 반환; return an Item on top of the Stack.Stack.
}