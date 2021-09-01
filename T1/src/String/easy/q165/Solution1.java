package String.easy.q165;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        for (int i = 0; i < v1.length || i < v2.length; i++) {
            int t1 = 0, t2 = 0;
            if (i < v1.length) {
                t1 = Integer.parseInt(v1[i]);
            }
            if (i < v2.length) {
                t2 = Integer.parseInt(v2[i]);
            }
            if (t1 > t2) {
                return 1;
            }
            if (t1 < t2) {
                return -1;
            }
        }
        return 0;
    }
}
