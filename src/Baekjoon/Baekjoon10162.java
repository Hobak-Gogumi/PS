package Baekjoon;

import java.io.*;

public class Baekjoon10162 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int countA = 0;
        int countB = 0;
        int countC = 0;

        countA = T / 300;
        T = T % 300;

        countB = T / 60;
        T = T % 60;

        countC = T / 10;
        T = T % 10;

        if(T != 0){
            bw.write(-1 + "\n");
        } else if(T == 0){
            bw.write(countA + " " + countB + " " + countC + "\n");
        }

        bw.flush();
        bw.close();
    }

}