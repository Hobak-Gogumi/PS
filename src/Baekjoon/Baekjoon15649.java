package Baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon15649 {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;

    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        //---입력 종료

        arr = new int[M]; //수열을 저장, 출력할 배열
        visited = new boolean[N+1]; //방문 배열

        DFS(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void DFS(int depth){

        if(depth == M){
            for(int num : arr)
                sb.append(num).append(" ");
            sb.append("\n");
            return;
        } else{
            for(int i = 1; i <= N; i++){
                if(!visited[i]){
                    visited[i] = true;
                    arr[depth] = i;
                    DFS(depth + 1);
                    visited[i] = false;
                }
            }
        }

    }

}