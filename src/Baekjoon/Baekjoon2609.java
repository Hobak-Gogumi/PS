package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A = 0; //최대공약수를 A라 칭함
        if(N >= M)
            A = gcd(N, M);
        else
            A = gcd(M, N);

        int B = (N * M) / A; //최소공배수를 B라고 칭함

        bw.write(A + "\n");
        bw.write(B + "\n");
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