package cn.ljtnono.leetcode.tree;

/**
 * @author Ling, Jiatong
 * Date: 2022/3/17 23:11
 */
public class TreeMaxDepth {

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

    // 求二叉树的最大深度
    public int maxDepth(TreeNode root) {
        // 使用深度优先算法，递归
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
