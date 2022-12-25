package Baekjoon;

import java.io.*;

public class Baekjoon2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int m = 1; m <= N; m++){
            for(int i = 0; i < (N-m); i++)
                bw.write(" ");
            for(int i = 0; i < m; i++)
                bw.write("*");

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

}