package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        int N = Integer.parseInt(br.readLine());

        int[] arrA = new int[N];
        int[] arrB = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        //정렬
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        //계산
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += arrA[i] * arrB[N-1-i];
        }

        //출력
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}