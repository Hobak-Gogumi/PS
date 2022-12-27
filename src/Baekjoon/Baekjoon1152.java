package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(st.countTokens() + "\n");
        bw.flush();
        bw.close();
    }

}