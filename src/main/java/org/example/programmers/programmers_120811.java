package org.example.programmers;

import java.util.Arrays;

public class programmers_120811 {
    public int programmers_120811(int[] array) {
        //array의 길이는 홀수.
        //0 < array의 길이 < 100
        int len = array.length;
        if(((len%2)==0)||len<0||len>100) return 0;
        Arrays.sort(array);
        return array[len/2];
    }
}
