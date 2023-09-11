package Baekjoon;

import java.io.*;

public class Baekjoon2193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //N자리

        long[][] dp = new long[N+1][2];

        dp[1][0] = 0; //1자리 이친수 중 0으로 끝나는 것의 개수
        dp[1][1] = 1; //1자리 이친수 중 1로 끝나는 것의 개수

        for(int i = 2; i <= N; i++){
            dp[i][0] = dp[i-1][0] + dp[i-1][1]; //0으로 끝나는 i자리수 이친수: i-1자리수 이친수 모두에 0을 붙여주면 된다.
            dp[i][1] = dp[i-1][0]; //1로 끝나는 i자리수 이친수: 0으로 끝나는 i-1자리수 이친수에 1을 붙여주면 된다.
        }

        long result = dp[N][0] + dp[N][1];

        bw.write(String.valueOf(result) + "\n");
        bw.flush();
        bw.close();
    }

}