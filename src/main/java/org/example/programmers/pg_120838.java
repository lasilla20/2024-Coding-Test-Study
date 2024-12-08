package org.example.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class pg_120838 {
    public String pg_120838(String letter) {
        int[][] mos = new int[][]{
                {0,0}
        };
        String ans = "";
        String[] str = letter.split("");
        for (int i = 0; i < letter.length(); i++) {
            for (int j = 0; j < mos.length; j++) {
                while (mos[j].equals(str[i])){
                    ans += mos[j][0];
                }
                else {
                    str += str[i];
                }
            }


        }
    }

    public String solution(String letter) {
        Map<String, String> mos = Stream.of(new Object[][] {
                {".-","a"},
                {"-...","b"},
                {"-.-.","c"},
                {"-..","d"},
                {".","e"},
                {"..-.","f"},
                {"--.","g"},
                {"....","h"},
                {"..","i"},
                {".---","j"},
                {"-.-","k"},
                {".-..","l"},
                {"--","m"},
                {"-.","n"},
                {"---","o"},
                {".--.","p"},
                {"--.-","q"},
                {".-.","r"},
                {"...","s"},
                {"-","t"},
                {"..-","u"},
                {"...-","v"},
                {".--","w"},
                {"-..-","x"},
                {"-.--","y"},
                {"--..","z"}
        }).collect(Collectors.toMap(item -> (String) item[0], data-> (String)data[1]));
        for(char c:letter.toCharArray()){
            if(mos.)
        }
        return new String();
}


