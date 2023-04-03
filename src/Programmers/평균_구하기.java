package Programmers;

public class 평균_구하기 {

    class Solution {
        public double solution(int[] arr) {
            double answer = 0;

            for(int i = 0; i < arr.length; i++){
                answer += arr[i];
            }

            answer = answer / arr.length;

            return answer;
        }
    }

}