package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15652 {

    static StringBuilder sb;

    static int N;
    static int M;

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        DFS(1, 0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void DFS(int n, int depth){
        if(depth == M){
            for(int num : arr)
                sb.append(num).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = n; i <= N; i++){
            arr[depth] = i;
            DFS(i, depth + 1);
        }

    }

}