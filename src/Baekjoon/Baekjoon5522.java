package Baekjoon;

import java.io.*;

public class Baekjoon5522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for(int i = 0; i < 5; i++){
            int score = Integer.parseInt(br.readLine());
            sum += score;
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}