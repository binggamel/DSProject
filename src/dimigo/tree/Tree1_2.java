package dimigo.tree;

class BinarySearchTree {

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






}







    /**
     *       (4)
     *      /   \
     *    (2)   (6)
     *   /  \   /  \
     * (1) (3) (5) (7)
     */
    public class Tree1_2 {
        public static void main(String[] args) {
            BinarySearchTree bst = new BinarySearchTree();

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
        }
    }



