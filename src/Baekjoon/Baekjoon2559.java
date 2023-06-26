package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2559 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        int[] sum = new int[N+1];

        st= new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1] + arr[i];
        }
        //---입력 종료

        int max = Integer.MIN_VALUE;

        for(int i = 0; i <= N-K; i++){
            int total = sum[i+K] - sum[i];

            if(total > max)
                max = total;
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

}