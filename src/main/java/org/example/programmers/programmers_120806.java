package org.example.programmers;

import java.util.Scanner;

public class programmers_120806 {
    public int programmers_120806(int num1, int num2) {
        double answer = (num1 / num2)*1000.0;
        System.out.println("answer = " + answer);
        if(answer<1){ answer = 0; }
        return (int) answer;
    }
}
