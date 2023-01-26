package Baekjoon;

import java.io.*;

public class Baekjoon2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        int[][] apart = new int[15][15];

        for(int i = 1; i < 15; i++){
            apart[0][i] = i;
        }

        for(int i = 0; i < 15; i++){
            apart[i][1] = 1;
        }

        for(int i = 1; i < 15; i++){
            for(int j = 2; j < 15; j++){
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
            }
        }

        for(int i = 0; i < T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(apart[k][n] + "\n");
        }

        bw.flush();
        bw.close();
    }

}