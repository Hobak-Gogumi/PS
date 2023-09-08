package Baekjoon;

import java.io.*;

public class Baekjoon15439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result = N * (N-1);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}