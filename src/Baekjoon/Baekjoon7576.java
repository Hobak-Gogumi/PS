package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon7576 {

    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {1, 0, 0, -1};

    static Queue<int[]> queue = new LinkedList<>();

    static int N;
    static int M;

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); //가로 칸의 수
        N = Integer.parseInt(st.nextToken()); //세로 칸의 수

        arr = new int[N][M];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                int value = Integer.parseInt(st.nextToken());
                arr[i][j] = value;

                if(value == 1) //익은 토마토를 큐에 삽입
                    queue.add(new int[] {i, j});
            }
        }
        //입력 종료

        //BFS수행
        BFS();

        //다 끝난 후 검사
        int max = 0;
        loop:
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j] == 0){
                    max = 0;
                    break loop;
                }

                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }

        bw.write((max-1) + "\n");
        bw.flush();
        bw.close();

    }

    static void BFS(){
        while(!queue.isEmpty()){
            int[] now = queue.remove();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++){
                int x = nowX + dx[i];
                int y = nowY + dy[i];

                if((x >= 0) && (x < N) && (y >= 0) && (y < M)){
                    if(arr[x][y] == 0){
                        queue.add(new int[] {x, y});
                        arr[x][y] = arr[nowX][nowY] + 1;
                    }
                }
            }
        }

    }

}