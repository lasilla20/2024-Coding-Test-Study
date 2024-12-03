package org.example.programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class pg_120821 {
    public int[] pg_120821(int[] num_list) {
        int[] arr = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            arr[i] = num_list[num_list.length-i-1];
        }
        return arr;
    }
}
