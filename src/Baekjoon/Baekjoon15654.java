package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon15654 {

    static StringBuilder sb;

    static int N;
    static int M;

    static int[] arr;
    static boolean[] visited;
    static int[] ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        sb = new StringBuilder();

        //첫째줄 입력
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];
        ans = new int[M];

        //둘째줄 입력
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //배열 정렬
        Arrays.sort(arr);

        //DFS
        DFS(0);

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void DFS(int depth){
        if(depth == M){
            for(int n : ans)
                sb.append(n).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                ans[depth] = arr[i];
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }

}