package org.example.programmers;

public class pg_120840 {
    class Solution {
        public int solution(int balls, int share) {
            if(balls==share) return 1;
            double ans = 1;
            for (int i = balls; i > balls-share; i--) ans *= i;
            for (int i = share; i > 0; i--) ans /= i;
            return (int)Math.round(ans);
        }
    }
}
