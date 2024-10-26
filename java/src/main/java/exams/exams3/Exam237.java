package exams.exams3;

import java.util.Arrays;

/**
 * 237-设计哈希映射
 *
 * @author ijlhjj
 * @version 1.0 2024-04-15
 */
public class Exam237 {

    static class MyHashMap {

        private int[] nums;

        public MyHashMap() {
            nums = new int[1000001]; //0 <= key <= 10^6
            Arrays.fill(nums, -1);
        }

        public void put(int key, int value) {
            nums[key] = value;
        }

        public int get(int key) {
            return nums[key];
        }

        public void remove(int key) {
            nums[key] = -1;
        }
    }

}
