package org.example.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class programmers_120817 {
    public double programmers_120817(int[] numbers) {
        Integer[] i = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(i);
        return list.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
