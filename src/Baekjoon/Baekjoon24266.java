package Baekjoon;

import java.io.*;

public class Baekjoon24266 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine()); //입력의 크기

        long count = n * n * n;

        sb.append(count).append("\n");
        sb.append(3).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}