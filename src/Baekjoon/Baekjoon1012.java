package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1012 {

    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {1, 0, 0, -1};

    static int[][] arr;
    static boolean[][] visited;

    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //입력
        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 수

        for(int i = 0; i < T; i++){ //테스트 케이스 수 만큼 반복
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken()); //가로길이
            N = Integer.parseInt(st.nextToken()); //세로길이
            int K = Integer.parseInt(st.nextToken()); //배추가 심어진 위치의 개수

            arr = new int[M][N];
            visited = new boolean[M][N];

            for(int j = 0; j < K ; j++){
                st = new StringTokenizer(br.readLine());

                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                arr[X][Y] = 1;
            }

            int count = 0; //지렁이 수를 카운트할 변수
            //배추밭 전체를 순회하면서 BFS 진행
            for(int a = 0; a < M; a++){
                for(int b = 0; b < N; b++){
                    if((arr[a][b] == 1) && (!visited[a][b])){
                        count++;
                        BFS(a, b);
                    }
                }
            }

            sb.append(count).append("\n");
        }

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()){
            int[] now = queue.remove();

            for(int i = 0; i < 4; i++){
                int newX = now[0] + dx[i];
                int newY = now[1] + dy[i];

                if((newX >= 0) && (newX < M) && (newY >= 0) && (newY < N)){
                    if((arr[newX][newY] == 1) && (!visited[newX][newY])){
                        visited[newX][newY] = true;
                        queue.add(new int[] {newX, newY});
                    }
                }
            }

        }
    }
}