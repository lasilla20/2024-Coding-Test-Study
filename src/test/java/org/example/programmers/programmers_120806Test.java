package org.example.programmers;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class programmers_120806Test {

    @Test
    void name() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double answer = (num1 / num2) * 1000.0;
        System.out.println("answer = " + answer);
        if (answer < 1) {
            answer = 0;
        }
    }
}