package Programmers;

public class 문자열의_앞의_n글자 {

    class Solution {
        public String solution(String my_string, int n) {
            String answer = my_string.substring(0, n);
            return answer;
        }
    }

}