package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon14940 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int n;
    static int m;

    static int[][] map;
    static int[][] result;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //가로 길이
        m = Integer.parseInt(st.nextToken()); //세로 길이

        map = new int[n][m]; //지도 생성
        result = new int[n][m]; //결과를 넣을 배열 생성
        visited = new boolean[n][m]; //방문 배열

        //지도 입력받기
        int startRow = 0;
        int startCol = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());

                //목표 지점의 위치 저장
                if(map[i][j] == 2){
                    startRow = i;
                    startCol = j;
                }
            }
        }

        //목표지점부터 BFS 수행
        BFS(startRow, startCol);

        //BFS 후 방문이 안되어있는 갈 수 있는 땅(1)은 -1값을 가져야 함
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                if((!visited[i][j]) && (map[i][j] == 1)){
                    result[i][j] = -1;
                }
            }
        }

        //출력
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    //BFS 메서드
    static void BFS(int row, int col){
        Queue<int[]> queue = new LinkedList<>();
        visited[row][col] = true;
        queue.add(new int[] {row, col});

        while(!queue.isEmpty()){
            int[] now = queue.remove();
            int nowRow = now[0];
            int nowCol = now[1];

            for(int i = 0; i < 4; i++){
                int newRow = nowRow + dx[i];
                int newCol = nowCol + dy[i];

                if((newRow >= 0) && (newRow < n) && (newCol >= 0) && (newCol < m)){
                    if((!visited[newRow][newCol]) && (map[newRow][newCol] == 1)){
                        result[newRow][newCol] = result[nowRow][nowCol] + 1;
                        visited[newRow][newCol] = true;
                        queue.add(new int[] {newRow, newCol});
                    }
                }
            }
        }
    }

}