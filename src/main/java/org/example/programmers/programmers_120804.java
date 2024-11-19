package org.example.programmers;

public class programmers_120804 {
    public int solution(int num1, int num2) {
        int answer = num1*num2;
        if(!(answer!=0)||10000<answer){
            return 0;
        }
        return answer;
    }
}
