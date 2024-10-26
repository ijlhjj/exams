package exams.exams2;

/**
 * 183-回旋镖的数量
 *
 * @author ijlhjj
 * @version 1.0 2024-01-08
 */
public class Exam183 {

    public int numberOfBoomerangs(int[][] points) {
        int count = 0;

        //三层循环遍历所有可能性
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                //计算两个点的欧氏距离，这里不进行开平方操作，两个相等值的开平方也相等。
                int[] point1 = points[i];
                int[] point2 = points[j];
                int xDiff = point1[0] - point2[0];
                int yDiff = point1[1] - point2[1];
                int distance = xDiff * xDiff + yDiff * yDiff;

                for (int k = j + 1; k < points.length; k++) {
                    //对比1、3点距离是否相等
                    int[] point3 = points[k];
                    int xDiff1 = point1[0] - point3[0];
                    int yDiff1 = point1[1] - point3[1];
                    int distance1 = xDiff1 * xDiff1 + yDiff1 * yDiff1;
                    if (distance == distance1) {
                        count += 2;
                        continue;
                    }

                    //对比2、3点距离是否相等
                    int xDiff2 = point2[0] - point3[0];
                    int yDiff2 = point2[1] - point3[1];
                    int distance2 = xDiff2 * xDiff2 + yDiff2 * yDiff2;
                    if (distance == distance2)
                        count += 2;

                    //对比1、2点距离是否相等
                    if (distance1 == distance2)
                        count += 2;
                }
            }
        }

        return count;
    }

}
