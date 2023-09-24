package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon27959 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //100원 동전의 갯수
        int M = Integer.parseInt(st.nextToken()); //초코바의 가격

        if((N * 100) >= M){
            bw.write("Yes\n");
        }
        else{
            bw.write("No\n");
        }

        bw.flush();
        bw.close();
    }

}