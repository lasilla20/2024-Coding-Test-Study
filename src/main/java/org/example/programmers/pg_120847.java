package org.example.programmers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class pg_120847 {
    public int pg_120847(int[] numbers) {
        Integer[] num = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(num, Collections.reverseOrder());
        return (int) num[0]*num[1];
    }
}
