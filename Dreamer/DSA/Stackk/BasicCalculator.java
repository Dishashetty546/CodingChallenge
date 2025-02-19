package Dreamer.DSA.Stackk;

import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "1+1";
        System.out.println(basic(s));

    }

    public static int basic(String s) {
        int len = s.length();
        int sign = 0;
        int ans = 0;
        int currno = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                currno = s.charAt(i) - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    currno = currno * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                currno = currno * sign;
                ans += currno;
                currno = 0;
                sign = 1;
            } else if (s.charAt(i) == '+') {
                sign = 1;
            } else if (s.charAt(i) == '-') {
                sign = -1;
            } else if (s.charAt(i) == '(') {
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            } else if (s.charAt(i) == ')') {
                int prevSign = stack.pop();
                ans = prevSign * ans;
                int prevans = stack.pop();
                ans = ans + prevans;
            }
        }
        return ans;

    }

}
