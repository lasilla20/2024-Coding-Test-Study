package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class bj_1157 {
    public bj_1157() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int maxValue = 0;
        char maxChar = 0;

        int[] alphabetArr = new int[26];
        for(int i=0; i<str.length(); i++){
            alphabetArr[str.charAt(i)-'A']++;
        }
        for(int i=0; i<26; i++){
            int compare = alphabetArr[i]- maxValue;
            if(compare > 0){
                maxValue = alphabetArr[i];
                maxChar = (char)('A'+i);
            } else if(compare == 0 ) maxChar ='?';
        }
        System.out.println(maxChar);
    }
}
