package main.java.leetcode.question;

/**
 * 两数相加
 * 难度:中等
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author loukai
 * @date 2020/6/24 14:54
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(0);
        ListNode tempNode = newNode;
        int carry = 0;
        for (;l1!=null||l2!=null||carry==1;){
            int number = (l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
            int mod = number%10;
            carry=number/10;
            tempNode= tempNode.next=new ListNode(mod);
            l1=l1==null?null:l1.next;
            l2=l2==null?null:l2.next;
        }
        return newNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = init(5,2,5);
        ListNode l2 = init(5,2,5);
        System.out.println(addTwoNumbers(l1,l2));
    }

    // 初始化节点
    private static ListNode init(int... numbers){
        ListNode node = new ListNode(0);
        ListNode tempNode = node;
        for (int i = numbers.length - 1; i >= 0; i--) {
            tempNode= tempNode.next=new ListNode(numbers[i]);
        }
        return node.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        ListNode temp = next;
        StringBuilder builder = new StringBuilder();
        builder.append(val);
        while (temp!=null){
            builder.append(temp.val);
            temp=temp.next;
        }
        return builder.reverse().toString();
    }
}
