package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon19532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int x = -999;
        int y = -999;

        loop:
        for(x = -999; x <= 999; x++){
            for(y = -999; y <= 999; y++){
                if((a*x + b*y == c) && (d*x + e*y == f))
                    break loop;
            }
        }

        bw.write(x + " " + y + "\n");
        bw.flush();
        bw.close();
    }
}