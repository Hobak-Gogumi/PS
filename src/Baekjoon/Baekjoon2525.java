package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int H = A + ((B+C)/60);
        int M = (B+C) % 60;

        if(H >= 24)
            H = H - 24;
        
        bw.write(H + " " +  M + "\n");
        bw.flush();
        bw.close();
    }

}