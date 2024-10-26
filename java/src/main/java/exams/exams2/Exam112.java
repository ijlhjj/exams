package exams.exams2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 112-餐厅过滤器
 *
 * @author ijlhjj
 * @version 1.0 2023-09-27
 */
public class Exam112 {

    /**
     * 餐馆类：主要用于实现题目要求的排序
     */
    class Restaurant implements Comparable<Restaurant> {
        public int id;
        public int rating;

        public Restaurant(int id, int rating) {
            this.id = id;
            this.rating = rating;
        }

        @Override
        public int compareTo(Restaurant o) {
            if (rating == o.rating) return o.id - id;
            return o.rating - rating;
        }
    }

    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Restaurant> restaurantList = new ArrayList<>();

        //遍历数组实现过滤
        for (int[] restaurant : restaurants) {
            //素食者过滤
            if (veganFriendly == 1 && restaurant[2] != 1) continue;

            //价格和距离过滤
            if (restaurant[3] <= maxPrice && restaurant[4] <= maxDistance)
                restaurantList.add(new Restaurant(restaurant[0], restaurant[1]));
        }

        Collections.sort(restaurantList); //餐馆类实现了题目要求的排序

        //转换为 id 列表
        List<Integer> ids = new ArrayList<>();
        for (Restaurant r : restaurantList)
            ids.add(r.id);

        return ids;
    }

}
