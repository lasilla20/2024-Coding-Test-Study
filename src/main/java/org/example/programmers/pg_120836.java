package org.example.programmers;

public class pg_120836 {
    public int solution(int n) {
        int ans = 1;
        for(int i=2; i<=n; i++){
            if (n%i==0) ans++;
        }
        return ans;
    }
}
