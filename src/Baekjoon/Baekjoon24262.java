package Baekjoon;

import java.io.*;

public class Baekjoon24262 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); //입력의 크기

        //입력값이 무엇이든간에 코드1은 한 번 수행된다. 수행횟수를 다항식으로 나타내면 1^0)이므로 차수는 0
        sb.append("1\n");
        sb.append("0\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}