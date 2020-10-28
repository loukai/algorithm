package main.java.leetcode.everyday;

import java.util.*;

/**
 *
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 *  示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
 *
 * @author loukai
 * @date 2020/10/27
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resp = new LinkedList<>();
        return recursion(resp,root);
    }

    private List<Integer> recursion(List<Integer> resp,TreeNode root){
        if (root!=null){
            resp.add(root.val);
            recursion(resp,root.left);
            recursion(resp,root.right);
        }
        return resp;
    }


    /**
     *
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalWhile(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> resp = new LinkedList<>();
        stack.push(root);
        if (root==null) return resp;
        while (!stack.isEmpty()){
            TreeNode  node = stack.pop();
            resp.add(node.val);
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left!=null){
                stack.push(node.left);
            }
        }
        return resp;
    }

    public List<Integer> preorderTraversalWhile2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
