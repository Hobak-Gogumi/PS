package Baekjoon;

import java.io.*;

public class Baekjoon17626 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //입력

        int[] dp = new int[n+1]; //dp배열 생성
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + 1;

            for(int j = 2; (j * j) <= i; j++){
                dp[i] = Math.min(dp[i], 1 + dp[i - (j*j)]);
            }
        }

        bw.write(dp[n] + "\n");
        bw.flush();
        bw.close();
    }

}