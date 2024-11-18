package org.example.programmers;

import java.util.Scanner;

public class programmers_120912 {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array){
            String str = String.valueOf(num);
            for (String s: str.split("")) {
                if(s.equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}
