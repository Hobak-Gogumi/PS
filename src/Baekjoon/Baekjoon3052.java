package Baekjoon;

import java.io.*;

public class Baekjoon3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] remainder = new int[42];

        for(int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine());
            remainder[n % 42]++;
        }

        int count = 0;
        for(int i = 0; i < 42; i++){
            if(remainder[i] >= 1)
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}