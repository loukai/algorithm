package main.java.leetcode.everyday;

import main.java.leetcode.everyday.bean.TreeNode;

/**
 * 129. 求根到叶子节点数字之和
 *
 *
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 *
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 *
 * 计算从根到叶子节点生成的所有数字之和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 *     1
 *    / \
 *   2   3
 * 输出: 25
 * 解释:
 * 从根到叶子节点路径 1->2 代表数字 12.
 * 从根到叶子节点路径 1->3 代表数字 13.
 * 因此，数字总和 = 12 + 13 = 25.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-root-to-leaf-numbers
 */
public class SumNumbers {

    public static int sumNumbers(TreeNode root) {
        return recursion(root,0);
    }
    public static int recursion(TreeNode node, int num) {
        if (node==null) return 0;
        num=num*10+node.val;
        if (node.left==null&&node.right==null){
            return num;
        }else {
            return recursion(node.left,num)+recursion(node.right,num);
        }
    }
}
