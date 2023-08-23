package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon21736 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int N;
    static int M;

    static char[][] campus;
    static boolean[][] visited;

    static int count = 0; //만날 수 있는 사람 카운트 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //행의 수
        M = Integer.parseInt(st.nextToken()); //열의 수

        campus = new char[N][M];
        visited = new boolean[N][M];

        int dyRow = 0; //도연이 위치한 행
        int dyCol = 0; //도연이 위치한 열
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                campus[i][j] = str.charAt(j);

                if(campus[i][j] == 'I'){
                    dyRow = i;
                    dyCol = j;
                }
            }
        }
        //입력 종료

        //BFS 수행
        BFS(dyRow, dyCol);

        if(count == 0)
            bw.write("TT"+ "\n");
        else
            bw.write(count + "\n");

        bw.flush();
        bw.close();
    }

    //BFS 메서드
    static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()){
            int[] now = queue.remove();
            int nowX = now[0];
            int nowY = now[1];

            if(campus[nowX][nowY] == 'P')
                count++;

            for(int i = 0; i < 4; i++){
                int X = nowX + dx[i];
                int Y = nowY + dy[i];

                if((X >= 0) && (X < N) && (Y >= 0) && (Y < M)){
                    if((!visited[X][Y]) && (campus[X][Y] != 'X')){
                        visited[X][Y] = true;
                        queue.add(new int[] {X, Y});
                    }
                }
            }

        }
    }
}