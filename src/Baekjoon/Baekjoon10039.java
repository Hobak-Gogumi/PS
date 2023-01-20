package Baekjoon;

import java.io.*;

public class Baekjoon10039 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for(int i = 0; i < 5; i++){
            int n = Integer.parseInt(br.readLine());
            if(n < 40)
                n = 40;

            sum += n;
        }

        int avg = sum / 5;

        bw.write(avg + "\n");
        bw.flush();
        bw.close();
    }
}