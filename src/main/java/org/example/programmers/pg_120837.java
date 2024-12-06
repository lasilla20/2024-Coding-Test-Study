package org.example.programmers;

public class pg_120837 {
    public int solution(int hp) {
        int ant = 0;
        while(hp>4) {
            hp-=5; ant++;
        }
        while(hp>2){
            hp-=3; ant++;
        }
        while(hp>0){
            hp-=1; ant++;
        }
        return ant;
    }
}
