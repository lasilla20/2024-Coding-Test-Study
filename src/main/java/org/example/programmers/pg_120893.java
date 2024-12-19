package org.example.programmers;

import java.util.Locale;

public class pg_120893 {
    public String pg_120893(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char c:my_string.toCharArray()) {
            if(Character.isLowerCase(c)){
                sb.append((c+"").toUpperCase());
            }
            else {
                sb.append((c+"").toLowerCase());
            }
        }
        return sb.toString();
    }
}
