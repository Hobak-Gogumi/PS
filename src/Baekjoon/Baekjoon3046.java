package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon3046 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int R2 = (2 * S) - R1;

        bw.write(R2 + "\n");
        bw.flush();
        bw.close();
    }

}