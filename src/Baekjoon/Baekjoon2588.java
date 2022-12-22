package Baekjoon;

import java.io.*;

public class Baekjoon2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(n1 * (n2 % 10)) + "\n"); //3
        bw.write(String.valueOf(n1 * ((n2 % 100)/10)) + "\n"); //4
        bw.write(String.valueOf(n1 * ((n2 % 1000)/100)) + "\n"); //5
        bw.write(String.valueOf(n1 * n2) + "\n"); //6

        bw.flush();
        bw.close();
    }

}