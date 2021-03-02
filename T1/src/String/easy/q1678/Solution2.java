package String.easy.q1678;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/goal-parser-interpretation/
 */
public class Solution2 {
    public String interpret(String command) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == 'G') {
                stringBuffer.append(c);
            } else if (c == '(') {
                c = command.charAt(++i);
                if (c == ')') {
                    stringBuffer.append('o');
                } else {
                    stringBuffer.append("al");
                }
            }
        }
        return stringBuffer.toString();
    }
}
