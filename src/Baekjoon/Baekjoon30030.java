package Baekjoon;

import java.io.*;

public class Baekjoon30030 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int B = Integer.parseInt(br.readLine());

        int A = B * 10 / 11;

        bw.write(A + "\n");
        bw.flush();
        bw.close();
    }

}