package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15964 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(calc(A, B)));
        bw.flush();
        bw.close();
    }

    static long calc(long n1, long n2){
        return (n1 + n2) * (n1 - n2);
    }

}