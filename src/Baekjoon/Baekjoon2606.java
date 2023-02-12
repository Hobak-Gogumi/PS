package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2606 {

    static int[][] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int C = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        A = new int[C+1][C+1];
        visited = new boolean[C+1];
        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a][b] = 1;
            A[b][a] = 1;
        }

        DFS(1);

        int count = 0;
        for(int i = 2; i <= C; i++){
            if(visited[i])
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();

    }

    static void DFS(int s){
        if(visited[s]){
            return;
        } else{
            visited[s] = true;
            for(int i = 1; i < A[s].length; i++){
                if(A[s][i] == 1)
                    DFS(i);
            }
        }
    }

}