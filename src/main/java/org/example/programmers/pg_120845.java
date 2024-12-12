package org.example.programmers;

public class pg_120845 {
    public int pg_120845(int[] box, int n) {
        if (box[0]==1&&box[1]==1&&box[2]==1&&n==1) return 1;
        if (box[0]<n||box[1]<n||box[2]<n) return 0;
        return ((box[0]/n)*(box[1]/n)*(box[2]/n));
    }
}
