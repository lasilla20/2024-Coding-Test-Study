package org.example.programmers;

public class programmers_120815 {
    public int programmers_120815(int n) {
        if(n<4||n==6) return 1;
        else for(int i=1; i<100; i++){
            if ((6*i)%n==0) return i;
        }
        return 1;
    }
}
