package string.easy.q1678;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/goal-parser-interpretation/
 */
public class Solution1 {
    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
