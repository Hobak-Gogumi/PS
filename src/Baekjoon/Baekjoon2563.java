package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2563 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        boolean[][] board = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){
                    board[j][k] = true;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(board[i][j] == true)
                    count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}