package org.example.programmers;

import java.util.Arrays;
import java.util.Locale;

public class programmers_120886 {
    public int solution(String before, String after) {
        char[] arr_b = before.toLowerCase().toCharArray();
        char[] arr_a = after.toLowerCase().toCharArray();
        Arrays.sort(arr_a);
        Arrays.sort(arr_b);
        String str1 = new String(arr_a);
        String str2 = new String(arr_b);
        int check = 1;
        if ((arr_b.length < 0 || arr_b.length > 1000) || (arr_a.length < 0 || arr_a.length > 1000)) {
            check = 0;
        }
        if(!str1.equals(str2)){
            check = 0;
        }
        return check;
    }
}
