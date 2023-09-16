package Baekjoon;

import java.io.*;

public class Baekjoon24263 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); //입력의 크기

        sb.append(n).append("\n"); //코드 1이 실행되는 횟수: n번
        sb.append(1).append("\n"); //수행횟수를 다항식으로 나타내면 n, 1차

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}