package Baekjoon;

import java.io.*;

public class Baekjoon5524 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String input = br.readLine();

            sb.append(input.toLowerCase()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}