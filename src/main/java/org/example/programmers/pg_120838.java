package org.example.programmers;

import java.util.*;

public class pg_120838 {
    class Solution {
        public String solution(String letter) {
            HashMap<String, Character> morse = new HashMap<>();
            morse.put(".-", 'a');
            morse.put("-...", 'b');
            morse.put("-.-.", 'c');
            morse.put("-..", 'd');
            morse.put(".", 'e');
            morse.put("..-.", 'f');
            morse.put("--.", 'g');
            morse.put("....", 'h');
            morse.put("..", 'i');
            morse.put(".---", 'j');
            morse.put("-.-", 'k');
            morse.put(".-..", 'l');
            morse.put("--", 'm');
            morse.put("-.", 'n');
            morse.put("---", 'o');
            morse.put(".--.", 'p');
            morse.put("--.-", 'q');
            morse.put(".-.", 'r');
            morse.put("...", 's');
            morse.put("-", 't');
            morse.put("..-", 'u');
            morse.put("...-", 'v');
            morse.put(".--", 'w');
            morse.put("-..-", 'x');
            morse.put("-.--", 'y');
            morse.put("--..", 'z');

            StringBuffer sb = new StringBuffer();
            String[] splitted = letter.split(" ");
            for(String s : splitted) {
                sb.append(morse.get(s));
            }
            return sb.toString();
        }
    }
}