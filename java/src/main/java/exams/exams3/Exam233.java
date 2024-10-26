package exams.exams3;

import java.util.*;

/**
 * 233-王位继承顺序
 *
 * @author ijlhjj
 * @version 1.0 2024-04-07
 */
public class Exam233 {

    static class ThroneInheritance {

        private String kingName; //保存国王姓名，递归遍历从国王开始
        private Map<String, List<String>> peoples = new HashMap<>(); //存放每个人的孩子列表
        private Set<String> alive = new HashSet<>(); //存储每个人是否活着

        public ThroneInheritance(String kingName) {
            this.kingName = kingName;
            peoples.put(kingName, new ArrayList<>());
            alive.add(kingName);
        }

        public void birth(String parentName, String childName) {
            //添加子节点
            List<String> childs = peoples.get(parentName);
            childs.add(childName);

            //添加孩子列表、状态
            peoples.put(childName, new ArrayList<>());
            alive.add(childName);
        }

        public void death(String name) {
            alive.remove(name); //死亡时移除
        }

        public List<String> getInheritanceOrder() {
            List<String> curOrder = new ArrayList<>();
            successor(kingName, curOrder); //递归继承列表
            return curOrder;
        }

        private void successor(String name, List<String> curOrder) {
            //添加未死亡姓名
            if (alive.contains(name))
                curOrder.add(name);

            //深度优先递归子列表
            List<String> childs = peoples.get(name);
            for (String child : childs) {
                successor(child, curOrder);
            }
        }

    }

}
