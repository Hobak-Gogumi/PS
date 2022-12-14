package Baekjoon;

import java.io.*;

public class Baekjoon8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        int score;
        int sum;
        for (int i = 0; i < T; i++) {
            String res = br.readLine();

            score = 0;
            sum = 0;

            for (int j = 0; j < res.length(); j++) {
                if (res.charAt(j) == 'O') {
                    score = score + 1;
                    sum = sum + score;
                } else if (res.charAt(j) == 'X') {
                    score = 0;
                }
            }
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}