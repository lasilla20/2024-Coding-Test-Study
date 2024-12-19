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
        int[] num = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            num[i] = array[i];
        }
        num[array.length + 1] = n;
        Arrays.sort(array);
        for(int i = 0; i<num.length; i++){
            if(n==num[i]){
                if(n==num[num.length]){
                    return num[i-1];
                } else if (n==num[0]) {
                    return num[i+1];
                } else {
                    int a = Math.abs(n-num[i+1]);
                    int b = Math.abs(n-num[i-1]);
                    return a < b ? a : b;
                }
            }
        }
        return 1;
    }
}
