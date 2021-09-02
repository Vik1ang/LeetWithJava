package InterviewQuestion.medium.q17.q14;

import java.util.PriorityQueue;

/**
 * @author Vikiang
 * @URL
 */
public class Solution2 {
    public int[] smallestK(int[] arr, int k) {
        int[] res = new int[k];
        if (k == 0) {
            return res;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : arr) {
            priorityQueue.offer(i);
        }
        for (int i = 0; i < k; i++) {
            res[i] = priorityQueue.poll();
        }
        return res;
    }
}
