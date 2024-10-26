package exams.exams2;

import exams.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 181-在链表中插入最大公约数
 *
 * @author ijlhjj
 * @version 1.0 2024-01-06
 */
public class Exam181 {

    /**
     * 求最大公约数函数。前置条件：m、n是大于0的正整数
     */
    public static int gcd(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        //转为节点列表
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }

        //计算插入节点
        List<ListNode> insertNodes = new ArrayList<>();
        for (int i = 0; i < nodes.size() - 1; i++) {
            int val = gcd(nodes.get(i).val, nodes.get(i + 1).val);
            insertNodes.add(new ListNode(val));
        }

        //合并列表
        for (int i = 0; i < nodes.size(); i++) {
            ListNode node = nodes.get(i);
            if (i < insertNodes.size()) {
                ListNode insertNode = insertNodes.get(i);
                insertNode.next = node.next;
                node.next = insertNode;
            }
        }

        return nodes.get(0);
    }

}
