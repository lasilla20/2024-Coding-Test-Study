package org.example.programmers;

public class programmers_120814 {
    public int programmers_120814(int n) {
        if(n<0||n>100) return 0;
        int answer=1;
        if(n<8) return 1;
        if(n%7>0) {
            answer = n/7+1;
        }
        else if(n%7==0) {
            answer = n/7;
        }
        return answer;
    }
}
