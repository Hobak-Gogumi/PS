package Baekjoon;

import java.io.*;

public class Baekjoon11727 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //DP배열 생성
        int DP[] = new int[1001];

        //DP배열 채우기
        DP[1] = 1;
        DP[2] = 3;
        for(int i = 3; i <= 1000; i++){
            DP[i] = (((DP[i-2] * 2) % 10007) + (DP[i-1] % 10007)) % 10007;
        }

        //n 입력받기
        int n  = Integer.parseInt(br.readLine());

        //출력
        bw.write(DP[n] + "\n");
        bw.flush();
        bw.close();
    }

}