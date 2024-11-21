package org.example.programmers;

import java.util.*;

public class programmers_120812 {

    public int Solution(int[] array){
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = number;
            }
            else if(count == maxCount) {
                answer = -1;
            }

            map.put(number, count);
        }
        return answer;
    }
    public int programmers_120812(int[] array) {
        //0 < array의 길이 < 100
        //0 ≤ array의 원소 < 1000
        if(array.length<0||array.length>100) return -1;
        if(array.length==1) return array[0];
        int[] index = new int[1000]; // 값별 개수를 구하기 위한 변수
        int rep = 0; // 중복여부
        int max = 0; // 최대값(최빈값)
        int answer = 0; // 결과값

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++; // 값별 개수를 구한다.
            // 값별 개수의 최대값이 곧 최빈값이 됨.
            if (max < index[array[i]]) {
                max = index[array[i]];
                answer = array[i];
            }
        }
        for (int i : index) {
            if (i == max) rep++;
            if (rep > 1) answer = -1;
        }

        return answer;
    }
}
