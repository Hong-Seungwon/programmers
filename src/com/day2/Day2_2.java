package com.day2;

public class Day2_2 {
    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;
            if((0 <= num1 && num1 <= 10000) && (0 <= num2 && num2 <= 10000)){
                if(num1 == num2){
                    return answer += 1;
                } else if (num1 != num2){
                    return answer -= 1;
                }
            }
            return answer;
        }
    }
}
