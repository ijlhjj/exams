package exams.exams1;

import exams.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 68-删除链表的倒数第 N 个结点
 *
 * @author ijlhjj
 * @version 1.0 2023-08-21
 */
public class Exam68 {

    /**
     * 使用一趟扫描实现：以空间换时间。
     * 遍历完链表前不知道链表长度，所以不能在第一次遍历时删除元素。
     * 遍历时把所有节点缓存到数组中，遍历完根据长度确定要删除的元素进行操作。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;

        List<ListNode> nodeList = new ArrayList<>();
        nodeList.add(node);

        //遍历链表缓存到数组中
        while (node.next != null) {
            node = node.next;
            nodeList.add(node);
        }

        int size = nodeList.size();

        int index = size - n; //待删除元素下标
        if (index == 0) {
            head = head.next;
        } else {
            node = nodeList.get(index);
            ListNode preNode = nodeList.get(index - 1); //前一个节点
            preNode.next = node.next;
        }

        return head;
    }

}
