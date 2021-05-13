package Tree;

public class LinkedBinarySearchTree {
    private Node root = new Node(); // root Node create

    // 이진 탐색 트리 탐색 연산
    /*
    searchBST(bsT, x) {
        p = bsT;
        if (p == null) {
            return null;
        }
        if (x == p.key) {
            return p;
        }
        if (x < p.key) {
            return searchBST(p.left, x);
        }
        else {
            return searchBST(p.right, x);
        }
    }
     */
    String SearchBST(int key) {
        /*
        1) 루트와 X 값 비교
        2) 크면: 우측 노드로 || 작으면: 좌측 노드로 || 같으면: 반환
        3) 재귀: 좌측/우측 노드와 X 값 비교
        4) 크면: 우측 노드로 || 작으면: 좌측 노드로 || 같으면: 반환
        */

        if (this.root.data == null && this.root.left == null && this.root.right == null) {
            return null;
        }


        if (this.root.key == key) { // root node's key == x's key
            System.out.println('!');
            return this.root.data;
        }




        return null;
    }


    // 이진 탐색 트리 삽입 연산
    /*
    InsertBST(bsT, x) {
        p = bsT;
        while (p != null) {
            if (x == p.key) {
                return x;
            }
            q = p;
            if (x < p.key) {
                p = p.left;
            }
            else {
                p = p.right;
            }
        }
    new = getNode();
    new.key = x;
    new.left = null;
    new.right = null;
    if (bsT == null) {
        bsT = new;
    }
    else if (x < q.key) {
        q.left = new;
    }
    else {
        q.right = new;
    }
    return;
    }
    */
    public void InsertBST(String data, int key) {
        /*
        1) 탐색 진행
        2) 값을 찾았으면: 크기 비교
        3) X가 값보다 크면: 우측 노드에 삽입 || X가 값보다 작으면: 좌측 노드에 삽입
        */

        //System.out.println(SearchBST(key)); // 탐색 진행

        System.out.println("this.root:" + this.root);

        if (SearchBST(key) == null) {
            this.root.data = data;
            this.root.key = key;
        }
        System.out.println("after: " + this.root);



    }


    // 이진 탐색 트리 삭제 연산
    /*

    */
    void DeleteBST() {
        /*
        - 차수가 0인 경우 == 단말 노드인 경우
            1) 탐색 진행
            2) 값을 찾았으면: 부모 노드의 링크에 null 대입

        - 자식 노드가 1개인 경우
            1) 탐색 진행
            2) 값을 찾았으면: 부모 노드 자리에 자식 노드 연결

        - 자식 노드가 2개인 경우
            1) 탐색 진행
            2) 값을 찾았으면: 좌측 서브트리의 최우측 노드, 우측 서브트리의 최좌측 노드 비교
            3-a) 좌측 서브트리의 최우측 노드를 후계자로 설정: 자식 노드 이동
            3-b) 우측 서브트리의 최좌측 노드를 후계자로 설정: 자식 노드 이동
        */
    }

}
