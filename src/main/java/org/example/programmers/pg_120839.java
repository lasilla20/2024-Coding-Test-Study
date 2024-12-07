package org.example.programmers;

import javax.xml.stream.events.Characters;

public class pg_120839 {
    public String solution(String rsp) {
        String ans = "";
        for(char num:rsp.toCharArray()) {
            int c = Character.getNumericValue(num);
            int i = c == 2 ? 0 : c == 0 ? 5 : 2;
            ans += i + "";
        }
        return ans;
    }
}