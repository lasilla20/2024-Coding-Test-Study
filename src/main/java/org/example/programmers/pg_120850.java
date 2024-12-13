package org.example.programmers;
import java.util.*;
public class pg_120850 {
    public int[] pg_120850(String my_string) {
        int[] arr = new int[my_string.length()];
        char[] my_c = my_string.toCharArray();
        int len = 0;
        for (int i = 0; i < my_c.length-1; i++) {
            if(Character.isDigit(my_c[i])){
                arr[len] = my_c[i];
                len++;
            }
        }
        int[] ans = Arrays.copyOfRange(arr, 0, len);
        Arrays.sort(ans);
        return ans;
    }

    public int[] Sol(String my_string){
        List<Integer> arr = new ArrayList<>();
        for (char c:my_string.toCharArray()) {
            if(Character.isDigit(c)){
                arr.add(Character.getNumericValue(c));
            }
        }
        arr.sort(Comparator.reverseOrder());
        int[] ans = arr.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}
