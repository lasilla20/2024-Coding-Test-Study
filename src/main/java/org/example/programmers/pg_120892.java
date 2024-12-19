package org.example.programmers;

public class pg_120892 {
    public String pg_120892(String cipher, int code) {
        StringBuffer sb = new StringBuffer();
        for (int i=code-1; i < cipher.length(); i+=code) {
            sb.append(cipher.split("")[i]);
        }
        return sb.toString();
    }
}
