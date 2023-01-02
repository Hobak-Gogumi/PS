package Baekjoon;

import java.io.*;

public class Baekjoon2441 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            for(int j = 0; j < (i-1); j++)
                bw.write(" ");
            for(int j = 0; j < (N-i+1); j++)
                bw.write("*");

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

}