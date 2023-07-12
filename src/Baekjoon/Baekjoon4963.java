package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon4963 {

    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    static int[][] arr;
    static boolean[][] visited;

    static int w;
    static int h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); //지도의 너비
            h = Integer.parseInt(st.nextToken()); //지도의 높이

            if((w == 0) && (h == 0)) // 0이 2개 주어지면 종료
                break;

            arr = new int[h][w];
            visited = new boolean[h][w];

            //배열 입력
            for(int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            //입력 종료

            //배열의 값이 1이고(땅), 아직 방문하지 않았으면 count를 증가시키고 BFS 수행
            int count = 0;

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if((arr[i][j] == 1) && (!visited[i][j])){
                        count++;
                        BFS(i, j);
                    }
                }
            }

            sb.append(count).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    //BFS 메서드
    static void BFS(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.add(new int[] {i, j});

        while(!queue.isEmpty()){
            int[] now = queue.remove();

            for(int k = 0; k < 8; k++){
                int X = now[0] + dx[k];
                int Y = now[1] + dy[k];

                if((X >= 0) && (X < h) && (Y >= 0) && (Y < w)){
                    if((arr[X][Y] == 1) && (!visited[X][Y])){
                        visited[X][Y] = true;
                        queue.add(new int[] {X, Y});
                    }
                }
            }
        }
    }

}