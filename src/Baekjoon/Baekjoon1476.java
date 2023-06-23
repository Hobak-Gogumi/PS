package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1476 {

    public static void main(String[] args) throws IOException {

        final int maxE = 15;
        final int maxS = 28;
        final int maxM = 19;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int year = 1;
        for(year = 1; ; year++){
            if((((year - E) % maxE) == 0) && (((year - S) % maxS) == 0) && (((year - M) % maxM) == 0))
                break;
        }


        bw.write(year + "\n");
        bw.flush();
        bw.close();
    }

}