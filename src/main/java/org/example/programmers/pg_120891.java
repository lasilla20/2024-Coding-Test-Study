package org.example.programmers;

public class pg_120891 {
    public int pg_120891(int order) {
        String sb = Integer.toString(order);
        int check = 0;
        for (char s:sb.toCharArray()) {
            if(s=='3'||s=='6'||s=='9') check++;
            }
        return check;
    }
}
