package Baekjoon;

import java.io.*;

public class Baekjoon14581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String id = br.readLine();

        sb.append(":fan::fan::fan:").append("\n");
        sb.append(":fan::").append(id).append("::fan:").append("\n");
        sb.append(":fan::fan::fan:").append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}