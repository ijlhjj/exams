package exams.exams2;

import java.time.LocalTime;
import java.util.*;

/**
 * 178-高访问员工
 *
 * @author ijlhjj
 * @version 1.0 2023-12-26
 */
public class Exam178 {

    /**
     * 判断是否 高访问 员工，同一小时内 访问系统 三次或更多
     *
     * @param accessTime 时间列表，已排序
     * @param i          起始下标，使用 i - i+2 三次时间进行判断
     */
    private boolean inOneHour(List<String> accessTime, int i) {
        // 起始时间字符串
        String start = accessTime.get(i);
        int h1 = Integer.valueOf(start.substring(0, 2)); //小时
        int m1 = Integer.valueOf(start.substring(2)); //分钟
        LocalTime s = LocalTime.of(h1, m1); //转为时间

        // 起始时间 大于等于 23 时，返回 true 。有效参数保证了不会大于 24 时
        LocalTime sl = LocalTime.of(22, 59);
        if (s.isAfter(sl)) {
            return true;
        }

        // 截止时间字符串
        String end = accessTime.get(i + 2);
        int h2 = Integer.valueOf(end.substring(0, 2)); //小时
        int m2 = Integer.valueOf(end.substring(2)); //分钟
        LocalTime e = LocalTime.of(h2, m2); //转为时间

        // 时间间隔正好相差一小时的时间 不 被视为同一小时内
        // 截止时间 小于 起始时间 +1 小时，返回 true
        if (s.plusHours(1).isAfter(e))
            return true;

        return false;
    }

    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> nameList = new ArrayList<>(); // 高访问 员工的姓名列表

        Map<String, List<String>> userAccessMap = new HashMap<>();
        //把访问列表转换为按用户分组的映射
        for (List<String> access : access_times) {
            String userName = access.get(0);
            String accessTime = access.get(1);

            List<String> userAccess = userAccessMap.get(userName);
            if (userAccess == null) {
                //如果访问列表为空
                userAccess = new ArrayList<>();
                userAccess.add(accessTime);
                userAccessMap.put(access.get(0), userAccess);
            } else {
                //列表不为空直接加入
                userAccess.add(accessTime);
            }
        }

        for (String userName : userAccessMap.keySet()) {
            List<String> accessTime = userAccessMap.get(userName); //访问时间列表
            //只有大于2次才判断
            if (accessTime.size() >= 3) {
                Collections.sort(accessTime); //排序
                for (int i = 0; i < accessTime.size() - 2; i++) {
                    //判断是否 高访问 员工，返回 true 时跳出循环
                    if (inOneHour(accessTime, i)) {
                        nameList.add(userName);
                        break;
                    }
                }
            }
        }

        return nameList;
    }

}
