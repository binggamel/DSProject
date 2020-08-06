package dimigo.tree;


class BinarySearchTree2 {

    public TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode makeNode(TreeNode left, int data, TreeNode right) {
        TreeNode node = new TreeNode(data);
        node.left = left;
        node.right = right;
        return node;
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void searchBST(int key) {
        searchBST(root, key);
    }

    // 탐색 연산 구현
    public void searchBST(TreeNode node, int key) {

        if (node == null){

            System.out.print(key + " Not Found ");

        }else if (key == node.data){
            System.out.print(key + "Found");

        }else if (key < node.data) {
            searchBST(node.left, key);

        }else searchBST(node.right, key);

    }

    public void insertBST(int data) {
        root = insertBST(root, data);
    }

    // 삽입 연산 구현
    public TreeNode insertBST(TreeNode node, int data) {
        if(node == null) return new TreeNode(data);
        if (data < node.data){
            node.left = insertBST(node.left,data);
        }else if (data > node.data){
            node.right = insertBST(node.right,data);
        }else {
            System.out.print(data + "Exists");
        }return node;
    }

    public void deleteBST(int data) {
        root = deleteBST(root, data);
    }

    // 삭제 연산 구현
    public TreeNode deleteBST(TreeNode node, int data) {
        if(node == null) return null;
        if (data < node.data){
            node.left = deleteBST(node.left,data);
        }else if (data > node.data){
            node.right = deleteBST(node.right,data);
        }else {
            if (node.left == null && node.right == null){
                return null;
            }else if (node.left == null){
                //자식이 한개
                return node.right;
            }else if (node.right == null){
                return  node.left;
            }else {
                // 자식이 2개인 경우
                node.data = getMinNode(node.right);
                node.right = deleteBST(node.right,node.data);
            }
        }return node;
    }

    private int getMinNode(TreeNode node) {
        while (node.left != null){
            node = node.left;
        }
        return node.data;
    }




}




public class Tree1_3 {
    /**
     *       (4)
     *      /   \
     *    (2)   (6)
     *   /  \   /  \
     * (1) (3) (5) (7)
     */

        public static void main(String[] args) {
            BinarySearchTree2 bst = new BinarySearchTree2();

            // 노드 추가
            bst.insertBST(4);
            bst.insertBST(2);
            bst.insertBST(6);
            bst.insertBST(1);
            bst.insertBST(3);
            bst.insertBST(5);
            bst.insertBST(7);
            bst.insertBST(7);   // 7 Exists

            bst.inorder();      // 1 2 3 4 5 6 7

            // 노드 탐색
            bst.searchBST(0);   // 0 Not Found
            bst.searchBST(1);   // 1 Found
            bst.searchBST(5);   // 5 Found

            // 1. 단말 노드 3 삭제
            bst.deleteBST(3);
            bst.inorder();          // 1 2 4 5 6 7

            // 2. 자식노드가 1개인 노드 2 삭제
            bst.deleteBST(2);
            bst.inorder();          // 1 4 5 6 7

            // 3. 자식노드가 2개인 노드 6 삭제
            bst.deleteBST(6);
            bst.inorder();          // 1 4 5 7
        }
    }

