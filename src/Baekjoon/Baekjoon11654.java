package Baekjoon;

import java.io.*;

public class Baekjoon11654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = br.readLine().charAt(0);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(c) +"\n");
        bw.flush();
        bw.close();
    }

}