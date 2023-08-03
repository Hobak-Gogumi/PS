package Baekjoon;

import java.io.*;

public class Baekjoon9461 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수

        //DP배열 채우기
        long[] DP = new long[101]; //int로 하면 오버플로우 발생
        DP[1] = 1; DP[2] = 1; DP[3] = 1; DP[4] = 2;
        for(int i = 5; i <= 100; i++){
            DP[i] = DP[i-5] + DP[i-1];
        }

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(DP[n]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}