package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1018 {

    static char[][] ans1 = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    };

    static char[][] ans2 = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    };

    static char[][] b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //N개의 줄
        int M = Integer.parseInt(st.nextToken());

        //보드판 입력받기
        b = new char[N][M];
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                b[i][j] = str.charAt(j);
            }
        }

        int min = 64;
        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){
                int s = check_w(i, j);
                int t = check_b(i, j);

                int z;
                if(s < t)
                    z = s;
                else
                    z = t;

                if(z < min)
                    min = z;
            }
        }

        bw.write(min + "\n");
        bw.flush();
        bw.close();

    }

    static int check_w(int i, int j){
        int count = 0;

        for(int r = 0; r < 8; r++){
            for(int c = 0; c < 8; c++){
                if(ans1[r][c] != b[r+i][c+j])
                    count++;
            }
        }

        return count;
    }

    static int check_b(int i, int j){
        int count = 0;

        for(int r = 0; r < 8; r++){
            for(int c = 0; c < 8; c++){
                if(ans2[r][c] != b[r+i][c+j])
                    count++;
            }
        }

        return count;
    }

}