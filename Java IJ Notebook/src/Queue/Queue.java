package Queue;

public interface Queue {

    boolean IsEmpty();          // Check Either Empty or not
    String EnQueue(String item);  // input a new item in the Queue.Queue
    String DeQueue();           // Delete a item of front and return it
    String peek();              // return a item of front
}
