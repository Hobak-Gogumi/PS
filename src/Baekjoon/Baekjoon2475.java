package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        for(int i = 0; i < 5; i++){
            int n = Integer.parseInt(st.nextToken());
            sum += (n * n);
        }

        int res = (sum % 10);

        bw.write(String.valueOf(res) + "\n");
        bw.flush();
        bw.close();
    }
}