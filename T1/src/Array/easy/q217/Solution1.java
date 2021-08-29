package Array.easy.q217;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        return nums.length != hashSet.size();
    }
}
