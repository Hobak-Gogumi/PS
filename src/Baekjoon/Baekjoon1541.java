package Baekjoon;

import java.io.*;

public class Baekjoon1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine(); //입력
        String[] numbers = str.split("\\-"); //'-'를 기준으로 끊기

        int result = 0;

        //첫 번째로 끊어진 부분은 전부 덧셈으로 계산한다.
        String[] firstExpression = numbers[0].split("\\+");
        for(String element : firstExpression){
            int n = Integer.parseInt(element);
            result += n;
        }

        //나머지 부분들은 전부 뺄셈으로 계산한다.
        for(int i = 1; i < numbers.length; i++){
            String[] expression = numbers[i].split("\\+");
            for(String element : expression){
                int n = Integer.parseInt(element);
                result -= n;
            }
        }

        //출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}