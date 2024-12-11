package org.example.programmers;

public class pg_120848 {
    public int pg_120848(int n) {
        int num = 1;
        int ans = 1;
        if (n==1) return num;
        if (n < 6) return 2;
       for(int i = 2; i < 99; i++){
           num *= i;
           if(n < num) {
               ans = i-1; break;
           }
       }
       return ans;
    }
}
