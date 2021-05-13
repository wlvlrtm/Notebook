package Tree;

public class LinkedBinarySearchTree {
    private Node root = new Node(); // root Node create

    // 이진 탐색 트리 탐색 연산
    public Node SearchBST(int key) {
        Node p = this.root;         // 루트 노드 복사

        while (p != null) {
            if (key < p.key) {       // 찾는 키값 < 노드의 키값
                p = p.left;          // 왼쪽 서브 트리 이동
            }
            else if (key > p.key) {  // 찾는 키값 > 노드의 키값
                p = p.right;         // 오른쪽 서브 트리 이동
            }
            else {                   // 탐색 성공
                return p;            // 찾은 노드 반환
            }
        }
        return null;                // 탐색 실패; null
    }


    // 이진 탐색 트리 삽입 연산
    public void InsertBST(String data, int key) {
        // 1) 탐색 진행
        Node p = this.root;
        Node q = p;

        if (this.root.data == null) {
            this.root.data = data;
            this.root.key = key;
        }
        else {
            while (p != null) {    // 공백 트리가 아닌 경우 반복
                if (key == p.key) {     // key 중복 감지
                    break;
                }
                q = p;  // 이동 전 p 값 복사

                if (key < p.key) {  // 찾는 키값 < 노드의 키값
                    p = p.left;     // 왼쪽 서브트리로 이동
                }
                else {              // 찾는 키값 > 노드의 키값
                    p = p.right;    // 오른쪽 서브트리로 이동
                }
            }
        }


        // 2) 삽입할 신규 노드 생성
        Node newNode = new Node();
        newNode.data = data;
        newNode.key = key;


        // 3) 삽입할 자리에 노드 추가
        if (this.root.data == null) {   // 공백 트리인 경우
            this.root = newNode;        // 신규 노드 연결
        }
        else if (newNode.key < q.key) { // 신규 노드의 키값 < 부모 노드의 키값
            q.left = newNode;
        }
        else if (newNode.key > q.key) { // 신규 노드의 키값 > 부모 노드의 키값
            q.right = newNode;
        }
    }


    // 이진 탐색 트리 삭제 연산
    public void DeleteBST(int key) {
        Node p = this.root;
        Node q = null;

        Node inherit;

        if (this.root.data == null) {   // 공백 트리라면,
            System.out.println("ERROR: Empty Tree");
        }
        else {
            while (p.data != null) {
                if (p.key == key) {     // 노드 탐색 성공
                    if (p.left == null && p.right == null) {    // 말단 노드일 경우,
                        if (q == null) {    // 루트 노드만 있을 경우,
                            this.root = null;
                            break;
                        }
                        else if (q.left == p) {  // 말단 노드가 좌측에 있을 경우,
                            q.left = null;
                            break;
                        }
                        else {                   // 말단 노드가 우측에 있을 경우,
                            System.out.println("!");
                            q.right = null;
                            break;
                        }
                    }
                    else if (p.left != null && p.right != null) {    // 말단 노드가 아닌 경우; 자식 노드가 2개인 경우
                        q = p.right;

                        if (q.right != null && q.left != null) {    // 상속 노드의 자식 노드가 2개인 경우
                            p.data = q.data;
                            p.right = q.right;
                            p.right.left = q.left;

                            p.key = q.key;
                            q.key = q.right.key;
                            q.data = q.right.data;
                        }
                        else if (q.right != null) {     // 상속 노드의 자식 노드가 우측 1개인 경우
                            p.data = q.data;
                            p.right = q.right;

                            p.key = q.key;
                            q.key = q.right.key;
                            q.data = q.right.data;
                        }
                        else if (q.left != null) {      // 상속 노드의 자식 노드가 좌측 1개인 경우
                            p.data = q.data;
                            p.right = q.left;

                            p.key = q.key;
                            q.key = q.left.key;

                            if (p.key > q.key) {    // 이진 탐색 트리 조건 오류 발생 시,
                                int temp = p.key;
                                String temp_str;
                                p.key = q.key;
                                q.key = temp;

                                temp_str = p.data;
                                p.data = q.left.data;
                                q.left.data = temp_str;
                            }
                        }
                        else {  // 상속 노드가 말단 노드인 경우
                            p.data = p.right.data;
                            p.key = p.right.key;
                            p.right = null;
                        }
                        break;
                    }
                    else {  // 말단 노드가 아닌 경우; 자식 노드가 1개인 경우
                        q = p.right;

                        if (q.left != null && q.right != null) {    // 상속 노드의 자식 노드가 2개인 경우
                            p.data = q.data;
                            p.left = q.left;
                            p.right = q.right;

                            p.key = q.key;
                            p.left.key = q.left.key;
                            p.right.key = q.right.key;
                        }
                        else if (q.left != null) {  // 상속 노드의 자식 노드가 좌측 1개인 경우
                            p.data = q.left.data;
                            p.key = q.left.key;
                            q.left = null;
                        }
                        else if (q.right != null) { // 상속 노드의 자식 노드가 우측 1개인 경우
                            p.data = q.data;
                            q.data = q.right.data;

                            p.key = q.key;
                            q.key = q.right.key;

                            q.right = null;
                        }
                        else {

                        }


                        break;
                    }
                }
                else if (p.key > key) {  // 찾는 키값 < 노드의 키값
                    q = p;
                    p = p.left;
                }
                else {              // 찾는 키값 > 노드의 키값
                    q = p;
                    p = p.right;
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Result: " + this.root;
    }
}
