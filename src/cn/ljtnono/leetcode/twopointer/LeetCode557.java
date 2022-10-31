package cn.ljtnono.leetcode.twopointer;

import java.util.Stack;

/**
 * LeetCode #557
 *
 * @author Ling, Jiatong
 * Date: 2022/4/2 00:37
 */
public class LeetCode557 {

    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(i);
            if (s.charAt(i) == ' ') {
                stack.pop();
                while (!stack.empty()) {
                    stringBuilder.append(s.charAt(stack.pop()));
                }
                stringBuilder.append(' ');
            }
            if (i == (s.length() - 1)) {
                while (!stack.empty()) {
                    stringBuilder.append(s.charAt(stack.pop()));
                }
            }
        }
        return stringBuilder.toString();
    }

}
