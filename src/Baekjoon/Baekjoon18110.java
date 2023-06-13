package Baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon18110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //n개의 난의도 의견 입력받기
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //정렬
        Arrays.sort(arr);

        //15%가 몇명인지 구하기
        int r = Math.round(n * 0.15f);

        //양 끝 15%를 제외한 난이도 의견 합 구하기
        int sum = 0;
        for(int i = r; i < n-r; i++){
            sum += arr[i];
        }

        //평균 구하기
        double avg = (sum * 1.0) / (n - 2*r);

        //최종 난이도
        int grade = (int)Math.round(avg);

        //출력
        bw.write(grade + "\n");
        bw.flush();
        bw.close();
    }

}