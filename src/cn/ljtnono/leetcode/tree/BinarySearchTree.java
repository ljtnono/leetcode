package cn.ljtnono.leetcode.tree;

/**
 * @author Ling, Jiatong
 * Date: 2022/3/17 23:26
 */
public class BinarySearchTree {

    public static class TreeNode {
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

    // 验证是否是二叉搜索树
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isValidBST(TreeNode root, int min, int max) {
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6, new TreeNode(3, null, null), new TreeNode(7, null, null)));

        System.out.println(isValidBST(root));
    }
}
