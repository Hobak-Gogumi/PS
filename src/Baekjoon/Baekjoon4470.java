package Baekjoon;

import java.io.*;

public class Baekjoon4470 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            String input = br.readLine();
            sb.append(i).append(". ").append(input).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}