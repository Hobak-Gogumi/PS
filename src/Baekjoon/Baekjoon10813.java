package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        for(int i = 1; i <= N; i++){
            arr[i] = i;
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        for(int i = 1; i <= N; i++){
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }

}
