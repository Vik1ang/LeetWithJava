package JianzhiOffer.easy.q3;

import java.util.HashSet;

public class Solution1 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return num;
            } else {
                hashSet.add(num);
            }
        }
        return -1;
    }
}
