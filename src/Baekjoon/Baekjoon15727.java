package Baekjoon;

import java.io.*;

public class Baekjoon15727 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());

        int answer = 0;
        if((L % 5) == 0)
            answer = L/5;
        else
            answer = (L/5) + 1;

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}