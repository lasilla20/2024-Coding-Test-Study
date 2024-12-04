package org.example.programmers;

import java.util.Arrays;

public class pg_120825 {
    public String pg_120825(String my_string, int n) {
        String[] str = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for (String s:str) {
            sb.append((s.repeat(n)));
        }
        return sb.toString();
    }
}
