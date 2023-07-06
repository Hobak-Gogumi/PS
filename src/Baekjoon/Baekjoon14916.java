package Baekjoon;

import java.io.*;

public class Baekjoon14916 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[100001];

        dp[2] = 1; //2원짜리 1개
        dp[4] = 2; //2원짜리 2개
        dp[5] = 1; //5원짜리 1개

        for(int i = 6; i <= n; i++){
            if((dp[i-2] > 0) && (dp[i-5] > 0))
                dp[i] = Math.min(dp[i-2], dp[i-5]) + 1;
            else if(dp[i-2] == 0)
                dp[i] = dp[i-5] + 1;
            else if(dp[i-5] == 0)
                dp[i] = dp[i-2] + 1;
        }

        if(dp[n] == 0)
            bw.write("-1");
        else
            bw.write(String.valueOf(dp[n]));

        bw.flush();
        bw.close();
    }

}