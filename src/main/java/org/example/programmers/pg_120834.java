package org.example.programmers;

public class pg_120834 {
    public String pg_120834(int age) {
        char[] arr = Integer.toString(age).toCharArray();
        String answer = "";
        for (char c:arr) {
            answer += (char) (c + 39);
        }
        return answer.toString();
    }
}
