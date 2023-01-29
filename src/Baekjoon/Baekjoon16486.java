package Baekjoon;

import java.io.*;

public class Baekjoon16486 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        final double PI = 3.141592;
        double ans = (2 * d1) + (2 * PI * d2);

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}