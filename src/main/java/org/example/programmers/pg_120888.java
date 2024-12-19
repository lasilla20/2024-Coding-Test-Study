package org.example.programmers;
class pg_120888 {
    public String solution(String my_string) {
        String ans = my_string;
        for (String s:my_string.split("")){
            String temp = s;
            ans = ans.replaceFirst(s,"1");
            ans = ans.replaceAll(s,"");
            ans = ans.replace("1",temp);
        }
    return ans;
    }
}
