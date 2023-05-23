package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11051 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] D = new int[N+1][N+1];

        for(int i = 0; i <= N; i++){
            D[i][i] = 1;
            D[i][1] = i;
            D[i][0] = 1;
        }

        //i가 3부터 시작하는 이유: 2행(i=2)까지는 바로 위 for문을 통해 값이 다 채워진다.
        //j가 2부터 i 전까지 수행되는 이유: 위 for문을 통해 0, 1, i일때의 값이 다 채워졌기 때문
        for(int i = 3; i <= N; i++){
            for(int j = 2; j < i; j++){
                D[i][j] = ((D[i-1][j-1] % 10007) + (D[i-1][j] % 10007)) % 10007;
            }
        }

        bw.write(D[N][M] + "\n");
        bw.flush();
        bw.close();
    }

}