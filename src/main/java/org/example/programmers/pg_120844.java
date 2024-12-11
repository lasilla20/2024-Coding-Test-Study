package org.example.programmers;

public class pg_120844 {
    public int[] solution(int[] numbers, String direction) {
        int tep = 0;
        if (direction=="left"){
            tep = numbers[0];
            for(int i=0; i<numbers.length-1; i++){
                numbers[i]=numbers[i+1];
            }
            numbers[numbers.length-1] = tep;
        }
        else {
            tep = numbers[numbers.length-1];
            for(int i=0; i<numbers.length-1; i++){
                numbers[i+1]=numbers[i];
            }
            numbers[0] = tep;
        }
        return numbers;
        }
}

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int tep = 0;
        int len = numbers.length-1;
        if (direction=="left"){
            tep = numbers[0];
            int i =0;
            while(i<len){
                numbers[i+1]=numbers[i];
                i++;
            }
            numbers[len] = tep;
        }
        else {
            tep = numbers[len];
            int i =0;
            while(i<len){
                numbers[i]=numbers[i+1];
                i++;
            }
            numbers[0] = tep;
        }
        return numbers;
    }
}
