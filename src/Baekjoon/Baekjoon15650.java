package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15650 {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        //---입력 종료

        arr = new int[M];

        DFS(0, 0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void DFS(int n, int depth){
        if(depth == M){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = n + 1; i <= N; i++){
            arr[depth] = i;
            DFS(i, depth + 1);
        }
    }

}