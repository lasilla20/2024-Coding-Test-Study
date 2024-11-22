package org.example.programmers;

public class programmers_120815 {
    public int programmers_120815(int n) {
        if(n<3||n==6) return 1;
        for(int i=n-1; i>1; i--){
            if(((i*6)%n)==0) return i;
        }
        return 1;
    }
}
