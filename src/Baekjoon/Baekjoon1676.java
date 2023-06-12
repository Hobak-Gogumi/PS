package Baekjoon;

import java.io.*;

public class Baekjoon1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        count += (N/5);  //5 = 5^1
        count += (N/25);  //25 = 5^2
        count += (N/125);  //125 = 5^3

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}