package Baekjoon;

import java.io.*;

public class Baekjoon1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int num = N;

        int cycle;
        for(cycle = 1; ; cycle++){
            int sum = (num / 10) + (num % 10);
            num = ((num % 10) * 10) + (sum % 10);

            if(num == N)
                break;
        }

        bw.write(cycle + "\n");
        bw.flush();
        bw.close();
    }

}