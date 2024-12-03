package org.example.programmers;

public class pg_120819 {
    public int[] pg_120819(int money) {
        int[] answer = {0,0};
        answer[0] = (int) money/5500;
        answer[1] = money%5500;
        return answer;
    }
}
