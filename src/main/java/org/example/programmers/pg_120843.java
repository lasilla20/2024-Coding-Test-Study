package org.example.programmers;

public class pg_120843 {
    class Solution {
        public int solution(int[] numbers, int k) {
            if (2>numbers.length || numbers.length>100 || 0>k || k>1000) return 0;
            return numbers[(k - 1) * 2 % numbers.length];
        }
    }
}
