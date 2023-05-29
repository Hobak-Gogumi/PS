package Baekjoon;

import java.io.*;

public class Baekjoon10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //배열 생성
        int[] count = new int[10001]; //arr 배열을 이루는 수는 10000보다 작거나 같은 자연수

        //숫자 입력받기
        for(int i = 0; i < N; i++){
            count[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 1; i < 10001; i++){
            for(int j = 0; j < count[i]; j++){
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();

    }

}