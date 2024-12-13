package org.example.programmers;

import java.util.*;

public class pg_120852 {
    public int[] pg_120852(int n) {
        List<Integer> tmpList = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                tmpList.add(i);
            }
        }
        return tmpList.stream().mapToInt(Integer::intValue).toArray();
    }
}
