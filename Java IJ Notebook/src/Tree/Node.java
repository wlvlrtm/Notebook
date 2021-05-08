package Tree;

public class Node {
    String data;
    Node left;
    Node right;

    public Node() {
        this.data = null;
        this.left = null;
        this.right = null;
    }


    @Override
    public String toString() {
        return "[" + this.left + " || " + this.data + " || " + this.right + "]";
    }
}
