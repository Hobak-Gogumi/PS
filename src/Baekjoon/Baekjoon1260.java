package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1260 {

    static int[][] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        A = new int[N+1][N+1];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a][b] = 1;
            A[b][a] = 1;
        }

        // --- 입력 종료
        visited = new boolean[N+1];
        DFS(V);
        System.out.println();

        visited = new boolean[N+1];
        BFS(V);

    }

    static void DFS(int s){
        if(visited[s]){
            return;
        } else{
            visited[s] = true;
            System.out.print(s + " ");
            for(int i = 1; i < A[s].length; i++){
                if(A[s][i] == 1)
                    DFS(i);
            }
        }
    }

    static void BFS(int s){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;

        while(!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n + " ");
            for(int i = 1; i < A[s].length; i++){
                if((A[n][i] == 1) && (visited[i] == false)){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

    }

}