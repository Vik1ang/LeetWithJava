package Array.easy.q169;

import java.util.Random;

public class Solution3 {
    public int majorityElement(int[] nums) {
        Random random = new Random();
        int majorityCount = nums.length / 2;

        while (true) {
            int candidate = nums[randRange(random, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }

    private int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private int randRange(Random random, int min, int max) {
        return random.nextInt(max - min) + min;
    }
}
