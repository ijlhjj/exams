package exams.exams2;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 110-LRU 缓存：实现 O(N)算法，有待优化
 *
 * @author ijlhjj
 * @version 1.0 2023-09-24
 */
public class Exam110 {

    class LRUCache {
        private final int capacity; //当前缓存的容量上限
        private Map<Integer, Integer> cacheMap;
        private Deque<Integer> deque; //保存访问顺序

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cacheMap = new HashMap<>();
            deque = new LinkedList<>();
        }

        public int get(int key) {
            Integer value = cacheMap.get(key);

            //存在当前缓存值
            if (value != null) {
                deque.remove(key); //O(N)复杂度
                deque.add(key);
                return value;
            }

            return -1; //不存在关键字返回 -1
        }

        public void put(int key, int value) {
            if (!cacheMap.containsKey(key)) {
                //只有达到缓存上限，并且缓存没有命中时，才需要删除最长时间没有访问的元素
                if (cacheMap.size() == capacity) {
                    cacheMap.remove(deque.remove());
                }
            } else {
                deque.remove(key); //O(N)复杂度
            }

            //加入或更新缓存
            deque.add(key);
            cacheMap.put(key, value);
        }
    }

}
