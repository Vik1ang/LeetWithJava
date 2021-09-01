package String.easy.q165;

/**
 * @author Vikiang
 * @URL
 */
public class Solution2 {
    public int compareVersion(String version1, String version2) {
        int n1 = version1.length(), n2 = version2.length();
        int p1 = 0, p2 = 0;
        while (p1 < n1 || p2 < n2) {
            int x = 0;
            while (p1 < n1 && version1.charAt(p1) != '.') {
                x = x * 10 + version1.charAt(p1) - '0';
                p1++;
            }
            p1++;
            int y = 0;
            while (p2 < n2 && version2.charAt(p2) != '.') {
                y = y * 10 + version2.charAt(p2) - '0';
                p2++;
            }
            p2++;
            if (x != y) {
                return x > y ? 1 : -1;
            }
        }
        return 0;
    }
}
