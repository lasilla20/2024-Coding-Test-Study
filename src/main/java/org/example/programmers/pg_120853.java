package org.example.programmers;

public class pg_120853 {
    public int pg_120853(String s) {
        String[] str = s.split(" ");
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[0].equals("Z")) return 0;
            if (str[i].equals("Z")) {
                sum -= Integer.parseInt(str[i - 1]);
                continue;
            }
            sum += Integer.parseInt(str[i]);

        }
        return sum;
    }
}
