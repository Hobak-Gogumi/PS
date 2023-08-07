package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon7569 {

    static Queue<int[]> queue = new LinkedList<>();

    static int[] dh = {-1, 1, 0, 0, 0, 0};
    static int[] dx = {0, 0, -1, 0, 1, 0};
    static int[] dy = {0, 0, 0, 1, 0, -1};

    static int M;
    static int N;
    static int H;

    static int[][][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); //상자의 가로칸의 수
        N = Integer.parseInt(st.nextToken()); //상자의 세로칸의 수
        H = Integer.parseInt(st.nextToken()); //상자의 수

        arr = new int[H][N][M];

        //토마토 정보 입력받기
        for(int i = 0; i < H; i++){
            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k++){
                    int n = Integer.parseInt(st.nextToken());
                    arr[i][j][k] = n;

                    if(n == 1)
                        queue.add(new int[] {i, j, k});
                }
            }
        }

        //BFS 수행
        BFS();

        //탐색
        //가장 큰 값을 찾는다.
        //만약 하나라도 0이 있으면 -1을 출력해야 함
        int max = Integer.MIN_VALUE;

        loop:
        for(int i = 0; i < H; i++){
            for(int j = 0; j < N; j++){
                for(int k = 0; k < M; k++){
                    if(arr[i][j][k] == 0){
                        max = 0;
                        break loop;
                    }

                    max = Math.max(max, arr[i][j][k]);
                }
            }
        }

        //출력
        bw.write((max-1) + "\n");
        bw.flush();
        bw.close();
    }

    static void BFS(){
        while(!queue.isEmpty()){
            int now[] = queue.remove();

            int nowH = now[0];
            int nowX = now[1];
            int nowY = now[2];

            for(int i = 0; i < 6; i++){
                int h = nowH + dh[i];
                int x = nowX + dx[i];
                int y = nowY + dy[i];

                if((h >= 0) && (h < H) && (x >= 0) && (x < N) && (y >= 0) && (y < M)){
                    if(arr[h][x][y] == 0){
                        arr[h][x][y] = arr[nowH][nowX][nowY] + 1;
                        queue.add(new int[] {h, x, y});
                    }
                }
            }
        }
    }

}