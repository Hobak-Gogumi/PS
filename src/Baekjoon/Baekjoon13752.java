package Baekjoon;

import java.io.*;

public class Baekjoon13752 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());

            for(int j = 0; j < input; j++){
                sb.append("=");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}