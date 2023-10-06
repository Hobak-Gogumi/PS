package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int Ysum = 0; //영식 요금제를 썼을때의 요금
        int Msum = 0; //민식 요금제를 썼을때의 요금

        //입력
        int N = Integer.parseInt(br.readLine()); //통화의 개수 N

        //N개의 통화시간 입력받기
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int time = Integer.parseInt(st.nextToken());

            //통화 요금 계산
            Ysum += ((time / 30) + 1) * 10;
            Msum += ((time / 60) + 1) * 15;
        }

        //싼 요금제 출력하기
        if(Msum < Ysum){
            sb.append("M").append(" ").append(Msum).append("\n");
        }
        else if(Msum == Ysum){
            sb.append("Y").append(" ").append("M").append(" ").append(Msum).append("\n");
        }
        else{
            sb.append("Y").append(" ").append(Ysum).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}