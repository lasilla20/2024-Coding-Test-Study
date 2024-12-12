package org.example.programmers;

public class pg_120844 {
    public int[] pg_120844(int[] numbers, String d) {
        int[] ans = new int[numbers.length];
        int len = numbers.length-1;
        if(d.equals("right")){
            for (int i = 0; i < len; i++) {
                ans[i+1] = numbers[i];
            }
            ans[0]=numbers[len];
        }
        else {
            for (int i = 1; i < numbers.length; i++) {
                ans[i-1] = numbers[i];
            }
            ans[len] = numbers[0];
        }
        return ans;
    }
}
