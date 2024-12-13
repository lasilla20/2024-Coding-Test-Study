package org.example.programmers;

public class pg_120851 {
    public int pg_120851(String my_string) {
        int ans = 0;
        for (char c:my_string.toCharArray()) {
            if(Character.isDigit(c)){
                ans += c-'0';
            }
        }
        return ans;
    }
}
