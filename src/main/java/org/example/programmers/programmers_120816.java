package org.example.programmers;

public class programmers_120816 {
    public int programmers_120816(int slice, int n) {
        if (slice == n) return 1;
        int pizza = 1;
        while (pizza<100){
            if(pizza*slice>=n) break;
            pizza++;
        }
        return pizza;
    }
}
