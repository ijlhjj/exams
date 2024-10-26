# k-avoiding 数组的最小总和 （与 "找出美丽数组的最小和" 相同）

## 题目描述

给你两个整数 n 和 k

对于一个由 不同 正整数组成的数组，如果其中不存在任何求和等于 k 的不同元素对，则称其为 k-avoiding 数组。

返回长度为 n 的 k-avoiding 数组的可能的最小总和。

### 示例 1

```text
    输入：n = 5, k = 4
    输出：18
    解释：设若 k-avoiding 数组为 [1,2,4,5,6] ，其元素总和为 18
    可以证明不存在总和小于 18 的 k-avoiding 数组。
```

### 示例 2

```text
    输入：n = 2, k = 6
    输出：3
    解释：可以构造数组 [1,2] ，其元素总和为 3
    可以证明不存在总和小于 3 的 k-avoiding 数组。
```

### 提示

```text
    * 1 <= n, k <= 50
```

### 题目出处

来源：力扣（LeetCode）  
链接：<https://leetcode.cn/problems/determine-the-minimum-sum-of-a-k-avoiding-array>  
<https://leetcode.cn/problems/find-the-minimum-possible-sum-of-a-beautiful-array>
