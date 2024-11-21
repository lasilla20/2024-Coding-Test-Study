package org.example.programmers;

import java.util.ArrayList;
import java.util.List;

public class programmers_120813 {
    public int[] programmers_120813(int n) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=1; i<n+1; i+=2){
            arr.add(i);
        }
        int[] answer = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}
