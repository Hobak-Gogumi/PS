package Baekjoon;

import java.io.*;

public class Baekjoon1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] D = new int[N+1]; //DP 배열 생성

        //DP 배열 채우기
        D[1] = 0;

        for(int i = 2; i <= N; i++){
            D[i] = D[i-1] + 1;
            if((i%2) == 0)
                D[i] = Math.min(D[i], D[i/2] + 1);
            if((i%3) == 0)
                D[i] = Math.min(D[i], D[i/3] + 1);
        }

        //출력
        bw.write(D[N] + "\n");
        bw.flush();
        bw.close();
    }

}