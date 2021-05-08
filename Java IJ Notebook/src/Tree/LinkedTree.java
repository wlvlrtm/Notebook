package Tree;

public class LinkedTree {
    private Node preNode = null;

    public Node MakeBT(Node btL, String data, Node btR) {   // 신규 노드 생성
        Node root = new Node();

        root.data = data;
        root.left = btL;
        root.right = btR;

        return root;
    }


    public void PostOrder(Node root) {  // 후위 탐색
        if(root != null) {
            PostOrder(root.left);                    // 왼쪽 서브 트리 이동
            PostOrder(root.right);                   // 오른쪽 서브 트리 이동
            System.out.print(root.data + " ");       // 노드(루트) 방문
        }
    }


    public String PreOrder(Node root) {   // 전위 탐색
        //System.out.println("enter");
        if(root != null) {
            System.out.print(root.data + " ");        // 노드(루트) 방문
            PreOrder(root.left);                      // 왼쪽 서브 트리 이동
            PreOrder(root.right);                     // 오른쪽 서브 트리 이동
            return root.data;
        }
        return null;
    }


    public void InOrder(Node root) {    // 중위 탐색
        if(root != null) {
            InOrder(root.left);                     // 왼쪽 서브 트리 이동
            System.out.print(root.data + " ");      // 노드(루트) 방문
            InOrder(root.right);                    // 오른쪽 서브 트리 이동
        }
    }

    public void SearchBT(Node root, String posData) {   // 말단 노드를 추가할 위치 탐색; (루트;전체 트리, 부모 노드의 데이터)
        if (root != null) {
            if (root.data.equals(posData)) {    // 탐색 중인 루트의 데이터 == 지정한 부모 노드의 데이터
                this.preNode = root;            // 찾아낸 부모 노드 추출
            }
            SearchBT(root.left, posData);                      // 왼쪽 서브 트리 이동
            SearchBT(root.right, posData);                     // 오른쪽 서브 트리 이동
        }
    }


    public void AddBT(String addData, Node pre, Node root) {    // 말단 노드 추가; (추가할 데이터, 부모 노드, 루트)
        Node addNode = MakeBT(null, addData, null);         // 신규 노드 생성
        SearchBT(root, pre.data);                                   // 부모 노드 탐색; (루트;전체 트리, 부모 노드의 데이터)
        this.preNode.left = addNode;                                // 추출한 부모 노드의 왼쪽 서브 트리에 신규 노드 추가; (덮어쓰기)
    }
}