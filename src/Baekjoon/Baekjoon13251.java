package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon13251 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //첫번째 줄 입력 받기
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[M];
        //두번째 줄 입력 받기, 조약돌의 총 갯수(N) 구하기
        st = new StringTokenizer(br.readLine());
        int N = 0;
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            N += num;
        }
        //세번째 줄 입력받기
        int K = Integer.parseInt(br.readLine());
        //-- 입력 끝

        double answer = 0.0;
        for(int i = 0; i < M; i++){
            double probability = 1.0;

            int numerator = arr[i];
            int denominator = N;
            for(int j = 0; j < K; j++){
                probability *= (double)numerator / denominator;

                numerator--;
                denominator--;
            }
            answer += probability;
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();

    }

}