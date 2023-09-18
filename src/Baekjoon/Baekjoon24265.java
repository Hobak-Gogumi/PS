package Baekjoon;

import java.io.*;

public class Baekjoon24265 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine()); //입력의 크기

        long count = n * (n-1) / 2;

        sb.append(count).append("\n");
        sb.append(2).append("\n");

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}