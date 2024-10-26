package exams.exams2;

import exams.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 189-删除排序链表中的重复元素 II
 *
 * @author ijlhjj
 * @version 1.0 2024-01-15
 */
public class Exam189_2 {

    public ListNode deleteDuplicates(ListNode head) {
        // 空链表直接返回
        if (head == null)
            return null;

        ListNode node = head;

        // 统计节点值出现的次数
        Map<Integer, Integer> counter = new HashMap<>();
        while (node != null) {
            counter.merge(node.val, 1, Integer::sum);
            node = node.next;
        }

        boolean flag = false; // 是否找到不重复节点

        // 节点头指向第一个不重复节点
        while (head != null) {
            if (counter.get(head.val) < 2) {
                flag = true;
                break;
            }
            head = head.next;
        }

        // 链表存在不重复节点
        if (flag) {
            node = head;
            // 遍历链接后续节点。最后节点重复时 node 为 null
            while (node != null && node.next != null) {
                ListNode next = node.next;
                // 查找后续第一个不重复节点
                while (next != null && counter.get(next.val) > 1)
                    next = next.next;

                node.next = next; // 不重复节点加入链表
                node = next; // 递推
            }
        }

        return head; // 返回头节点
    }

}
