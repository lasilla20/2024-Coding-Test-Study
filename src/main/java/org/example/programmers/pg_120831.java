package org.example.programmers;

public class pg_120831 {
    public int pg_120831(int n) {
        int num = 0;
        if (n%2==1) n--;
        while(n>0){
            num += n;
            n -= 2;
        }
        return num;
    }
}
