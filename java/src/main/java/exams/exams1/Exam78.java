package exams.exams1;

import java.util.ArrayList;
import java.util.List;

/**
 * 78-复制带随机指针的链表
 *
 * @author ijlhjj
 * @version 1.0 2023-08-28
 */
public class Exam78 {

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node node = head; //复制引用以不改变原链表
        List<Node> nodeList = new ArrayList<>(); //存储原链表节点
        List<Node> copyNodes = new ArrayList<>();//存储拷贝链表节点

        //遍历链表存储在列表中，列表顺序保持了链表的原顺序
        while (node != null) {
            nodeList.add(node);
            copyNodes.add(new Node(node.val));
            node = node.next;
        }

        //遍历列表对链表指针进行赋值
        int size = nodeList.size();
        for (int i = 0; i < nodeList.size(); i++) {
            Node n1 = nodeList.get(i); //原节点
            Node n2 = copyNodes.get(i); //拷贝节点

            if (i < size - 1) n2.next = copyNodes.get(i + 1); //除最后一个节点外，拷贝节点的后续元素指向列表的下一项

            //如果原节点的随机指针不为空，查找其指向节点的索引，根据索引赋值拷贝指针指向新的拷贝节点
            Node nr = n1.random;
            if (nr != null) {
                int index = nodeList.indexOf(nr);
                n2.random = copyNodes.get(index);
            }
        }

        return copyNodes.get(0); //返回拷贝列表的头节点
    }

    /**
     * Definition for a Node.
     */
    static class Node {

        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

        /**
         * 根据数组元素值创建链表
         *
         * @param nodes 创建链表的双值列表，随机指针的 NULL 使用 -1 表示
         * @return 空数组返回NULL，否则返回链表的头 head
         */
        public static Node createNode(int[][] nodes) {
            if (nodes.length < 1)
                return null;

            Node[] nodeArr = new Node[nodes.length];

            //遍历列表创建链表节点
            for (int i = 0; i < nodes.length; i++) {
                int[] node = nodes[i];
                nodeArr[i] = new Node(node[0]);
            }

            //遍历列表对指针进行赋值
            int size = nodeArr.length;
            for (int i = 0; i < nodes.length; i++) {
                int[] node = nodes[i];

                if (i < size - 1)
                    nodeArr[i].next = nodeArr[i + 1];  //除最后一个节点外，节点的后续元素指向列表的下一项

                if (node[1] != -1)
                    nodeArr[i].random = nodeArr[node[1]]; //随机指针不为 NULL 的指向指定索引节点
            }

            return nodeArr[0];
        }

    }

}
