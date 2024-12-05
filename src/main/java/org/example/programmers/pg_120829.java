package org.example.programmers;

public class pg_120829 {
    public int pg_120829(int angle) {
        return (int) angle==180 ? 4 : angle>90 ? 3 : angle==90 ? 2 : 1;
    }
}
