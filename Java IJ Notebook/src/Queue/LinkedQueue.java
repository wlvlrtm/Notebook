package Queue;

public class LinkedQueue implements Queue {
    private class Node {
        String data;    // data field
        Node link;      // link field

        public Node() {
            this.data = null;
            this.link = null;
        }
    }


    private int size = 0;
    private Node front;
    private Node rear;
    private Node old;

    public LinkedQueue() {
        this.front = null;
        this.rear = null;
    }


    @Override
    public boolean IsEmpty() {
        return this.front == null;
    }


    @Override
    public String EnQueue(String item) {
        Node node = new Node();
        node.data = item;
        node.link = null;

        this.size += 1;

        if (IsEmpty()) {
            this.rear = node;
            this.front = node;
        }
        else {
            this.rear.link = node;
            this.rear = node;
        }
        return "EnQueue: " + node.data;
    }


    @Override
    public String DeQueue() {
        String temp;
        if(IsEmpty()) {
            return "DeQueue: ERROR - Queue.Queue is Empty";
        }
        else {
            this.size -= 1;
            this.old = this.front;

            temp = this.front.data;
            this.front = this.front.link;

            if (IsEmpty()) {
                this.rear = null;
            }
            return "DeQueue: " + temp;
        }
    }


    @Override
    public String peek() {
        if(IsEmpty()) {
            return "Peek: ERROR - Queue.Queue is Empty";
        }
        else {
            return "Peek: " + this.front.data;
        }
    }


    @Override
    public String toString() {
        String result = "";
        Node reTemp = this.front;

        if (IsEmpty()) {
            return "Queue.ArrayQueue {" + "item = '[" + result + "]', front = " + null + ", rear = " + null + ", size = " + this.size + '}';
        }
        else {
            result += reTemp.data + ", ";

            for (int i = 1; i < this.size; i++) {
                reTemp = reTemp.link;
                result += reTemp.data;

                if (i != this.size - 1) {
                    result += ", ";
                }
            }
            return "Queue.ArrayQueue {" + "item = '[" + result + "]', front = " + this.front.data + ", rear = " + this.rear.data + ", size = " + this.size + '}';
        }
    }
}
