package cn.ljtnono.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ling, Jiatong
 * Date: 2022/3/18 01:13
 */
public class MediumOrder {



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

    // 二叉树的中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return inorderTraversal(result, root);
    }


    public List<Integer> inorderTraversal(List<Integer> result, TreeNode treeNode) {
        // 1.先确定递归函数的参数和返回值
        // 2.确定终止条件
        // 3.确定单层递归逻辑
        if (treeNode == null) {
            return result;
        }
        if (treeNode.left != null) {
            result.addAll(inorderTraversal(result, treeNode.left));
        }
        result.add(treeNode.val);
        if (treeNode.right != null) {
            result.addAll(inorderTraversal(result, treeNode.right));
        }
        return result;
    }



}
