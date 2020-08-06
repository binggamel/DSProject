package dimigo.tree;

public class TreeNode {

    public TreeNode left;
    public int data;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }

}

class BinaryTree {
    public TreeNode root;
    public int size;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode makeNode(TreeNode left, int data, TreeNode right) {
        TreeNode tn = new TreeNode(data);
        tn.left = left;
        tn.right = right;
        tn.data = data;
        size++;
        return tn;
    }
}



