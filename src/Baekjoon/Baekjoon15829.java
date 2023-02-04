package Baekjoon;

import java.io.*;

public class Baekjoon15829 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;
        int r = 31;
        int M = 1234567891;

        long pow = 1;
        for(int i = 0; i < L; i++){
            sum += ((str.charAt(i) - 96) * pow) % M;
            pow = (pow * r) % M;
        }

        long ans = sum % M;

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}