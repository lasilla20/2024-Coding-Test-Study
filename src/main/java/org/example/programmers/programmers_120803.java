package org.example.programmers;

public class programmers_120803 {
    public int solution(int num1, int num2) {
        int answer = num1-num2;
        if((-100000>=answer)||(100000<=answer)){
            return 0;
        }
        return answer;
    }
}
