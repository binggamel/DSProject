package dimigo.tree;

public class Tree1_1 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        TreeNode n4 = bt.makeNode(null, 4, null);
        TreeNode n5 = bt.makeNode(null, 5, null);
        TreeNode n2 = bt.makeNode(n4, 2, n5);
        TreeNode n3 = bt.makeNode(null, 3, null);
        TreeNode n1 = bt.makeNode(n2, 1, n3);

        bt.setRoot(n1);
        System.out.println(bt.size);   // 5
    }
}


