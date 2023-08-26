package Baekjoon;

import java.io.*;

public class Baekjoon15894 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        long answer = 4 * n;

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}