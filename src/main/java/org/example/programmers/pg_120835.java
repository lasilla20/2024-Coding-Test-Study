package org.example.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class pg_120835 {
    public int[] pg_120835(int[] emergency) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int v : emergency) {
            pq.add(v);
        }
        int[] ans = new int[emergency.length];

        int rank = 1;
        while (!pq.isEmpty()) {
            int max = Integer.valueOf(pq.poll());
            for (int i = 0; i < emergency.length; i++) {
                if (max == emergency[i]) {
                    ans[i] = rank;
                    break;
                }
                rank++;
            }
        }
        return ans;
    }
}
