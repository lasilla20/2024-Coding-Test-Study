package org.example.programmers;

public class programmers_120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1 * denom2 + numer2 * denom1;
        int den = denom1 * denom2;
        int gcdNum = gcd(num,den);
        int[] answer = new int[]{num/gcdNum,den/gcdNum};
        return answer;
    }
    public static int gcd(int n, int m){
        while(m!=0){
            int tmp = n%m;
            n=m;
            m=tmp;
        }
        return n;
    }
}
