package Array.easy.q169;

public class Solution4 {
    public int majorityElement(int[] nums) {
        return majorityElementRecursion(nums, 0, nums.length - 1);
    }

    private int majorityElementRecursion(int[] nums, int lo, int hi) {
        if (lo == hi) {
            return nums[lo];
        }
        int mid = lo + (hi - lo) / 2;
        int left = majorityElementRecursion(nums, lo, mid);
        int right = majorityElementRecursion(nums, mid + 1, hi);

        if (left == right) {
            return left;
        }

        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = 0; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

}
