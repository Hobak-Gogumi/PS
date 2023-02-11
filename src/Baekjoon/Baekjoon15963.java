package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15963 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        if(N == M)
            bw.write(1 + "\n");
        else
            bw.write(0 + "\n");

        bw.flush();
        bw.close();
    }

}