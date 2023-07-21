package Baekjoon;

import java.io.*;

public class Baekjoon9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] D = new int[11]; //DP배열 생성
        //DP 배열 채우기
        D[1] = 1;
        D[2] = 2;
        D[3] = 4;
        for(int i = 4; i <= 10; i++){
            D[i] = D[i-3] + D[i-2] + D[i-1];
        }

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(D[n]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}