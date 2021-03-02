package Array.easy.q1752;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */
public class Solution1 {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean isCount = nums[0] >= nums[n-1];

        for(int i=1;i<n;i++){

            if(nums[i]<nums[i-1]){
                if(isCount){
                    isCount = false;
                }else{
                    return false;
                }
            }

        }
        return true;
    }
}
