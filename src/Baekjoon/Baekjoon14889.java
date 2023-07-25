package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon14889 {

    static int N;

    static int[][] arr;
    static boolean[] visited;

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //입력 종료

        DFS(1, 0);

        //출력
        bw.write(min + "\n");
        bw.flush();
        bw.close();
    }

    static void DFS(int s, int count){
        if(count == N/2){
            calGap();
            return;
        }

        for(int i = s+1; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;
                DFS(i, count + 1);
                visited[i] = false;
            }
        }
    }

    static void calGap(){
        int start = 0;
        int link = 0;

        for(int i = 1; i < N; i++){
            for(int j = i+1; j <= N; j++){
                if(visited[i] && visited[j]) //방문배열이 true인 경우 -> start 팀.
                    start += (arr[i][j] + arr[j][i]);

                if(!visited[i] && !visited[j]) //방문배열이 false인 경우 -> link 팀.
                    link += (arr[i][j] + arr[j][i]);
            }
        }

        int gap = Math.abs(start - link);
        min = Math.min(min, gap);

    }
}