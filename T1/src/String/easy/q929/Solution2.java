package String.easy.q929;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/unique-email-addresses/
 */
public class Solution2 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replaceAll("\\.", "");
            hashSet.add(local + rest);
        }
        return hashSet.size();
    }
}
