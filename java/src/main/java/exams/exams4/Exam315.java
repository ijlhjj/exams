package exams.exams4;

import exams.ListNode;

/**
 * 315-合并零之间的节点
 *
 * @author ijlhjj
 * @version 1.0 2024-09-09
 */
public class Exam315 {

    public ListNode mergeNodes(ListNode head) {
        head = head.next; //跳过头节点 0

        int val = 0;
        ListNode resultHead = new ListNode(); //创建空头节点
        ListNode curr = resultHead;

        while (head != null) {
            //找到 0 节点时创建 next
            if (head.val == 0) {
                ListNode next = new ListNode(val); //创建节点
                curr.next = next; //链接下一节点
                curr = next;
                val = 0; //值归 0
            } else {
                val += head.val; //值累加
            }

            head = head.next;
        }

        //返回跳过空头节点
        return resultHead.next;
    }

}
