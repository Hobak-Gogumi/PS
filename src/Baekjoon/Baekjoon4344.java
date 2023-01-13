package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C  = Integer.parseInt(br.readLine());

        for(int i = 0; i < C; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];

            int sum = 0;
            for(int j = 0; j < N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum = sum + arr[j];
            }

            double avg = (sum * 1.0) / N;

            int count = 0;
            for(int j = 0; j < N; j++){
                if(arr[j] > avg)
                    count++;
            }

            double ans = count * 100.0 / N;
            bw.write(String.format("%.3f", ans) + "%\n");
        }

        bw.flush();
        bw.close();

    }

}