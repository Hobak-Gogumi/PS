package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10156 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); //과자 한 개의 가격
        int N = Integer.parseInt(st.nextToken()); //사려고 하는 과자의 개수
        int M = Integer.parseInt(st.nextToken()); //현재 동수가 가진 돈

        int cost = K * N; //과자를 전체 구입할 때 필요한 돈

        if((cost - M) > 0){
            sb.append(cost - M).append("\n");
        }
        else{
            sb.append(0).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}