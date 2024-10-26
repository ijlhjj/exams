/* 6-两数相加
 *
 */

#include <stdio.h>
#include <stdlib.h>

/* 题库提供的链表结构 */
struct ListNode
{
    int val;
    struct ListNode *next;
};

/* 使用指定值创建链表节点 */
struct ListNode *makeListNode(int val)
{
    struct ListNode *node;

    node = malloc(sizeof(struct ListNode)); // 申请存储空间

    node->val = val;
    node->next = NULL; // 后续节点默认为空指针
    return node;
}

/* 逆序链表求和函数
 *
 * 两个链表非空
 */
struct ListNode *addTwoNumbers(struct ListNode *l1, struct ListNode *l2)
{
    int val;
    struct ListNode *head, *node;

    val = l1->val + l2->val;       // 第一个节点的和
    node = makeListNode(val % 10); // 用个位数创建第一个节点
    head = node;                   // 把第一个节点赋给链表头，作为返回值

    /* 循环求和每个节点 */
    while (l1->next != NULL || l2->next != NULL)
    {
        val /= 10; // 初值为进位值

        // 第一个链表元素求和。在判断时同时赋值会在后续循环中因为空指针抛出异常
        if (l1->next != NULL)
        {
            l1 = l1->next;
            val += l1->val;
        }

        // 第二个链表元素求和。在判断时同时赋值会在后续循环中因为空指针抛出异常
        if (l2->next != NULL)
        {
            l2 = l2->next;
            val += l2->val;
        }

        // 用个位数创建节点，赋值给后续节点指针，并递归节点
        node->next = makeListNode(val % 10);
        node = node->next;
    }

    // 如果最后一次求和还有进位，则创建一个进位节点
    if (val / 10 > 0)
        node->next = makeListNode(val / 10);

    return head;
}

/* 使用指定数组值辅助创建测试链表 */
struct ListNode *createListNode(int nums[], size_t l)
{
    struct ListNode *head, *node;

    head = makeListNode(nums[l - 1]); // 创建头节点

    // 根据数组元素循环创建后续节点，并重置头节点
    for (int i = l - 2; i >= 0; i--)
    {
        node = head;
        head = makeListNode(nums[i]);
        head->next = node;
    }

    return head;
}

/* 辅助打印测试链表 */
void printListNode(struct ListNode *lp)
{
    printf("%d,", lp->val); // 打印第一个值

    // 循环打印后续节点值
    while ((lp = lp->next) != NULL)
        printf("%d,", lp->val);

    printf("\n");
}

int main(int argc, char const *argv[])
{
    struct ListNode *result;
    struct ListNode *l1, *l2;

    // 创建两个测试链表
    int ln1[] = {2, 4, 3};
    int ln2[] = {5, 6, 4};
    l1 = createListNode(ln1, 3);
    l2 = createListNode(ln2, 3);

    // 调用链表求和函数并打印结果
    result = addTwoNumbers(l1, l2);
    printListNode(result);

    return 0;
}
