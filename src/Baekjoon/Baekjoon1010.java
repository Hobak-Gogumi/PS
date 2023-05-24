package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //DP 배열 생성
        int[][] D = new int[31][31];

        for(int i = 0; i <= 30; i++){
            D[i][0] = 1;
            D[i][1] = i;
            D[i][i] = 1;
        }

        for(int i = 3; i <= 30; i++){
            for(int j = 2; j < i; j++){
                D[i][j] = D[i-1][j-1] + D[i-1][j];
            }
        }
        //--- 생성 끝

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            //값 구하기
            bw.write(D[M][N] + "\n");
        }

        bw.flush();
        bw.close();
    }

}