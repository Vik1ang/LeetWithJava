package String.easy.q387;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class Solution4 {
    class Pair {
        char ch;
        int pos;

        public Pair(char ch, int pos) {
            this.ch = ch;
            this.pos = pos;
        }
    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, i);
                queue.offer(new Pair(c, i));
            } else {
                hashMap.put(c, -1);
                while (!queue.isEmpty() && hashMap.get(queue.peek().ch) == -1) {
                    queue.poll();
                }
            }

        }
        return queue.isEmpty() ? -1 : queue.poll().pos;
    }
}
