package org.example.programmers;

public class pg_120824 {
    public int[] pg_120824(int[] num_list) {
        int[] answer = new int[]{0,0};
        for (int n:num_list) {
            int i = n % 2 == 0 ? answer[0]++ : answer[1]++;
        }
        return answer;
    }
}
