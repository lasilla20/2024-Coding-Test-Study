package org.example.programmers;

public class pg_120818 {
    public int pg_120818(int price) {
        if (500000<=price) return (int) (0.8*price);
        if (300000<=price) return (int) (0.9*price);
        if (100000<=price) return (int) (0.95*price);
        return price;
    }
}
