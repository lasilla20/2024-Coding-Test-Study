package org.example.programmers;

public class pg_120846 {
    public int pg_120846(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int op = 0;
            for (int j = 1; j <= 100; j++) {
                if(i%j==0) {
                    op++;
                }
                if(op >= 3) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
