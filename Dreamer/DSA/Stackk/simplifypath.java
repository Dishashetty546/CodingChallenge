package Dreamer.DSA.Stackk;

import java.util.Stack;

public class simplifypath {
    public static void main(String[] args) {
        String s = "/a/b/../c/";
        System.out.println(simplifyPath(s));

    }

    public static String simplifyPath(String path) {
        Stack<String> ps = new Stack<>();
        StringBuilder res = new StringBuilder();
        String p[] = path.split("/");
        for (int i = 0; i < p.length; i++) {
            if (!ps.isEmpty() && p[i].equals("..")) {
                ps.pop();
            } else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")) {
                ps.push(p[i]);
            }
        }
        while (!ps.isEmpty()) {
            res.insert(0, "/" + ps.pop());
        }

        return res.length() == 0 ? "/" : res.toString();

    }

}
