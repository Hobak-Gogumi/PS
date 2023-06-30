package Baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon2217 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //정렬
        Arrays.sort(arr);

        //계산
        int max = 0;
        for(int i = 0; i < N; i++){
            int sum = arr[i] * (N-i);

            if(sum > max)
                max = sum;
        }

        //출력
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

}