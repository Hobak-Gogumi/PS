package Baekjoon;

import java.io.*;

public class Baekjoon24264 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine()); //입력의 크기

        long answer = n * n; //수행 횟수는 n^2

        sb.append(answer).append("\n");
        sb.append(2).append("\n"); //수행 횟수를 다항식으로 나타내면 n^2 이므로, 최고차항의 차수는 2

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}