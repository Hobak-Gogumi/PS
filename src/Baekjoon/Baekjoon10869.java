package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(A+B) +"\n");
        bw.write(String.valueOf(A-B) +"\n");
        bw.write(String.valueOf(A*B) +"\n");
        bw.write(String.valueOf(A/B) +"\n");
        bw.write(String.valueOf(A%B) +"\n");

        bw.flush();
        bw.close();
    }

}