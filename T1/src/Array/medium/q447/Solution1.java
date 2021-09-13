package Array.medium.q447;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] p : points) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int[] q : points) {
                int dis = (int) (Math.pow(p[0] - q[0], 2) + Math.pow(p[1] - q[1], 2));
                hashMap.put(dis, hashMap.getOrDefault(dis, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int m = entry.getValue();
                ans += m * (m - 1);
            }

        }
        return ans;
    }
}
