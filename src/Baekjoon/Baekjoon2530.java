package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2530 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //입력 시작
        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); //현재 시
        int B = Integer.parseInt(st.nextToken()); //현재 분
        int C = Integer.parseInt(st.nextToken()); //현재 초

        int D = Integer.parseInt(br.readLine()); //요리하는 데 필요한 초
        //입력 종료

        int seconds = C + D;

        int minutes = B + (seconds / 60);
        seconds = seconds % 60;

        int hours = A + (minutes / 60);
        minutes = minutes % 60;

        hours = hours % 24;

        //출력
        sb.append(hours).append(" ").append(minutes).append(" ").append(seconds).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}