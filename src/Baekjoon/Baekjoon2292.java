package Baekjoon;

import java.io.*;

public class Baekjoon2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int i;
        for(i = 1; ; i++){
            int max = (3 * i * (i-1)) + 1;

            if(N <= max)
                break;
        }

        bw.write(i + "\n");
        bw.flush();
        bw.close();
    }

}