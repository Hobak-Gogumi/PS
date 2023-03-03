package Baekjoon;

import java.io.*;

public class Baekjoon5554 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for(int i = 0; i < 4; i++){
            sum += Integer.parseInt(br.readLine());
        }

        int x = sum / 60;
        int y = sum % 60;

        bw.write(x + "\n");
        bw.write(y + "\n");

        bw.flush();
        bw.close();
    }

}