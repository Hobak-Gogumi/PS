package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon5596 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //민국 점수 입력받기
        st = new StringTokenizer(br.readLine());
        int S = 0;
        for(int i = 0; i < 4; i++){
            S += Integer.parseInt(st.nextToken());
        }

        //만세 점수 입력받기
        st = new StringTokenizer(br.readLine());
        int T = 0;
        for(int i = 0; i < 4; i++){
            T += Integer.parseInt(st.nextToken());
        }

        int max = Math.max(S, T);

        //출력
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

}