package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon16430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        sb.append(B-A).append(" ").append(B).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}