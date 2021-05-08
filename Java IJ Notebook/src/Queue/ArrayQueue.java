package Queue;

public class ArrayQueue implements Queue {
    String[] q;
    String item;

    int front;
    int rear;
    int size;

    // Create A new Empty Queue.Queue
    public ArrayQueue(int size) {
        this.q = new String[size];
        this.item = null;
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }


    // Check Either Empty or not
    @Override
    public boolean IsEmpty() {
        return this.front == this.rear;
    }


    // Check Either Full or not
    public boolean IsFull() {
        return (this.rear + 1) % this.size == this.front;
    }


    // input a new item in the Queue.Queue
    @Override
    public String EnQueue(String item) {
        if (IsFull()) {
            return "Error: Queue.Queue is Full";
        }
        else {
            this.item = item;
            this.rear = (this.rear + 1) % this.size;    // (2 + 1) % 4 = 3 || (3 + 1) % 4 = 0
            this.q[this.rear] = this.item;   // item input
            return this.q[this.rear];
        }
    }


    // Delete a item of front and return it
    @Override
    public String DeQueue() {
        if (IsEmpty()) {
            return "ERROR: Queue.Queue is Empty";
        }
        else {
            this.front = (this.front + 1) % this.size;  // (2 + 1) % 4 = 3 || (3 + 1) % 4 = 0
            this.size -= 1;
            return this.q[this.front];  // item return
        }
    }

    // return a item of front
    @Override
    public String peek() {
        if (IsEmpty()) {
            return "ERROR: Queue.Queue is Empty";
        }
        else {
            return this.q[front+1];
        }
    }


    @Override
    public String toString() {
        String result = "";
        for (int i = front+1; i < this.q.length; i++) {
            result += this.q[i];
            if (i != this.q.length - 1) {
                 result += ", ";
            }
        }

        return "Queue.ArrayQueue {" + "item = '[" + result + "]', front = " + this.front + ", rear = " + this.rear + ", size = " + this.size + '}';
    }
}
