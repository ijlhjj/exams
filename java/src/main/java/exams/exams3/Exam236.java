package exams.exams3;

/**
 * 236-设计哈希集合
 *
 * @author ijlhjj
 * @version 1.0 2024-04-14
 */
public class Exam236 {

    static class MyHashSet {

        private int[] nums;

        public MyHashSet() {
            nums = new int[1000001]; //0 <= key <= 10^6
        }

        public void add(int key) {
            nums[key] = 1;
        }

        public void remove(int key) {
            nums[key] = 0;
        }

        public boolean contains(int key) {
            return nums[key] == 1;
        }
    }

}
