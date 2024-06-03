package top.yangcc.easy;

/**
 * 给你一个 二叉树 的根结点 root，该二叉树由恰好 3 个结点组成：根结点、左子结点和右子结点。
 * <p>
 * 如果根结点值等于两个子结点值之和，返回 true ，否则返回 false 。
 */
public class Subject2236 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }

    public static void main(String[] args) {
    }
}