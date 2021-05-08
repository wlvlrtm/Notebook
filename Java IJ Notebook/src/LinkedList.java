public class LinkedList {
    private class Node {
        private String data;
        private Node link;

        public Node() {
            this.data = null;
            this.link = null;
        }
    }


    private Node head;
    private int size = 0;


    public LinkedList() {
        this.head = null;
    }


    public void InsertFirstNode(String data) {
        Node node = new Node();
        node.data = data;
        node.link = this.head;
        this.head = node;
        this.size += 1;
    }


    public Node SearchNode(String data) {
        Node temp = this.head;

        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp;
            }
            else {
                temp = temp.link;
            }
        }
        return null;
    }


    public void InsertMiddleNode(String preData, String data) {
        Node preNode = SearchNode(preData);
        Node node = new Node();
        node.data = data;

        if (preNode == null) {
            System.out.println(preData + "를 찾을 수 없음");
        }
        else {
            node.link = preNode.link;
            preNode.link = node;
        }


        this.size += 1;
    }


    public void InsertLastNode(String data) {
        Node node = new Node();
        Node temp;
        node.data = data;
        node.link = null;

        if (this.head == null) {
            this.head = node;
        }
        else {
            temp = this.head;

            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = node;
        }
        this.size += 1;
    }

    public Node DeleteNode(String preData) {
        Node pre = SearchNode(preData);
        Node old = new Node();

        if (this.head == null) {
            System.out.println("공백 리스트");
        }
        else {
            old = pre.link;
            if (old != null) {
                pre.link = old.link;
            }
        }
        this.size -= 1;
        return old;
    }




    @Override
    public String toString() {
        String result = "";
        Node temp = this.head;

        for (int i = 0; i < this.size; i++) {
            result += temp.data;
            if (i < this.size - 1) {
                result += ", ";
            }
            temp = temp.link;
        }


        return "LinkedList{" + "head = [" + result + "], size = " + this.size + '}';
    }
}
