package Baekjoon;

import java.io.*;

public class Baekjoon25314 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //정수 N

        for(int i = 0; i < N / 4; i++){
            sb.append("long").append(" ");
        }

        sb.append("int");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}