package org.example.programmers;

public class programmers_120809 {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            //-10,000 ≤ numbers의 원소 ≤ 10,000
            if(numbers[i]<-10000||numbers[i]>10000){
                return new int[]{0};
            }
            numbers[i]=numbers[i]*2;
        }
        return numbers;
    }
}
