package Baekjoon;

import java.io.*;

public class Baekjoon1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수

        int[][] D = new int[41][2]; //DP배열 생성. 0번 열은 0이 출력되는 횟수, 1번 열은 1이 출력되는 횟수.

        //DP배열 채우기
        D[0][0] = 1; D[0][1] = 0;
        D[1][0] = 0; D[1][1] = 1;
        for(int i = 2; i <= 40; i++){
            D[i][0] = D[i-1][0] + D[i-2][0];
            D[i][1] = D[i-1][1] + D[i-2][1];
        }

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(D[N][0]).append(" ").append(D[N][1]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}