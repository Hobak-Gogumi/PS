package Programmers;

import java.util.*;

public class 게임_맵_최단거리 {

    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {1, 0, 0, -1};

    static int N;
    static int M;

    static boolean[][] visited;

    public int solution(int[][] maps) {

        N = maps.length;
        M = maps[0].length;

        visited = new boolean[N][M];

        BFS(0, 0, maps);

        int answer = maps[N-1][M-1];

        if((answer == 0) || (answer == 1))
            return -1;
        else
            return answer;
    }

    void BFS(int i, int j, int[][] arr){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        visited[i][j] = true;

        while(!queue.isEmpty()){
            int now[] = queue.poll();
            for(int k = 0; k < 4; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if((x >= 0) && (x < N) && (y >= 0) && (y < M)){
                    if((arr[x][y] == 1) && (!visited[x][y])){
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1;
                        queue.offer(new int[] {x, y});
                    }
                }
            }
        }

    }

}