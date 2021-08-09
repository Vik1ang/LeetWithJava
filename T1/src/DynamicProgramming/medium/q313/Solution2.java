package DynamicProgramming.medium.q313;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author Vikiang
 * @URL
 */
public class Solution2 {
    public int nthSuperUglyNumber(int n, int[] primes)  {
        HashSet<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        seen.add(1L);
        heap.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long curr = heap.poll();
            ugly = (int) curr;
            for (int prime : primes) {
                long next = curr * prime;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }
}
