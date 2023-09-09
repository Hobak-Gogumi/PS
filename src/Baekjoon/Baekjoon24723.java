package Baekjoon;

import java.io.*;

public class Baekjoon24723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //녹색 거탑의 높이

        int result = (int) Math.pow(2, N);

        //출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}