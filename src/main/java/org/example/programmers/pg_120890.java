package org.example.programmers;

import java.util.*;
import java.util.stream.Stream;

public class pg_120890 {
    public int pg_120890(int[] array, int n) {
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(array[i]==n) return n;
            if(array[0]>n) return array[0];
            if(array[array.length]<n) return array[array.length];
            else {
                int a = Math.abs(n-array[i+1]);
                int b = Math.abs(n-array[i-1]);
                return a < b ? a : b;
            }
        }
        return 1;
    }


    public int pg_120890_(int[] array, int n) {
        Arrays.sort(array);
        Stack<Integer> stack = new Stack<Integer>();
        for (int a:array) {
            stack.push(a);
        }

        while (!stack.empty()){
            if(stack.contains(n)) return n;
            Integer last = stack.pop();
            Integer mid = stack.pop();
            if(mid.equals(n)){

            }

        }

    }
}
