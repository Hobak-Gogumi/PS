package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //바구니의 수
        int M = Integer.parseInt(st.nextToken()); //방법의 수

        int[] arr = new int[N+1];

        for(int i = 1; i <= N; i++){
            arr[i] = i;
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int k = b;
            for(int j = a; j <= (a+b)/2; j++){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;

                k--;
            }
        }

        //출력
        for(int i = 1; i <= N; i++){
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }

}