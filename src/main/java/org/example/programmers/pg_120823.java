package org.example.programmers;

import java.util.Scanner;

public class pg_120823 {
    public pg_120823() {

    }

    public static void main(String[] args) {
        System.out.print("Enter star: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<1||10<n) System.exit(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
