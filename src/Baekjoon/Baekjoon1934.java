package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int n;
            if(A > B)
                n = gcd(A, B);
            else
                n = gcd(B, A);

            bw.write((A*B)/n + "\n");
        }

        bw.flush();
        bw.close();
    }

    static int gcd(int max, int min){
        if((max % min) == 0)
            return min;
        else
            return gcd(min, max % min);
    }

}