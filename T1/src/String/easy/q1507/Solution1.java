package String.easy.q1507;

import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reformat-date/
 */
public class Solution1 {
    public String reformatDate(String date) {
        String[] strings = date.split(" ");
        String year = strings[2];
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Jan", "01");
        hashMap.put("Feb", "02");
        hashMap.put("Mar", "03");
        hashMap.put("Apr", "04");
        hashMap.put("May", "05");
        hashMap.put("Jun", "06");
        hashMap.put("Jul", "07");
        hashMap.put("Aug", "08");
        hashMap.put("Sep", "09");
        hashMap.put("Oct", "10");
        hashMap.put("Nov", "11");
        hashMap.put("Dec", "12");
        String month = hashMap.get(strings[1]);
        String day = null;
        if (strings[0].length() == 4) {
            day = strings[0].substring(0, 2);
        } else {
            day = "0" + strings[0].substring(0, 1);
        }
        return new StringBuilder().append(year + "-" + month + "-" + day).toString();
    }
}
