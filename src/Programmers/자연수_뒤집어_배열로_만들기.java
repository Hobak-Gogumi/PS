package Programmers;

public class 자연수_뒤집어_배열로_만들기 {

    class Solution {
        public int[] solution(long n) {
            String str = String.valueOf(n);

            int[] answer = new int[str.length()];

            int i = 0;
            while(n != 0){
                answer[i] = (int)(n % 10);
                n = n / 10;
                i++;
            }

            return answer;
        }
    }
    
}