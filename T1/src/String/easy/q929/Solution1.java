package String.easy.q929;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/unique-email-addresses/
 */
public class Solution1 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();
        for (String email : emails) {
            int mid = email.indexOf("@");
            String first = email.substring(0, mid);
            String last = email.substring(mid);
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) == '+') {
                    break;
                } else if (first.charAt(i) == '.') {
                    continue;
                } else {
                    builder.append(first.charAt(i));
                }
            }
            String newEmail = builder.toString() + last;
            hashSet.add(newEmail);
        }
        return hashSet.size();
    }
}
