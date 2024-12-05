package org.example.programmers;

public class pg_120826 {
    public String pg_120826(String my_string, String letter) {
        if (letter.length()!=1) return new String();
        StringBuffer sb = new StringBuffer();
        for (String s:my_string.split("")) {
            if(s.equals(letter)) continue;
            sb.append(s);
        }
        return sb.toString();
    }
}
