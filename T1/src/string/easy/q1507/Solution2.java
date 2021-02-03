package string.easy.q1507;

import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reformat-date/
 */
public class Solution2 {
    public String reformatDate(String date) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 1; i < 12; i++) {
            hashMap.put(months[i - 1], i);
        }
        String[] strings = date.split(" ");
        int year = Integer.parseInt(strings[2]);
        int month = hashMap.get(strings[1]);
        int day = Integer.parseInt(strings[0].substring(0, strings[0].length() - 2));
        return String.format("%d-%02d-%02d", year, month, day);
    }
}
