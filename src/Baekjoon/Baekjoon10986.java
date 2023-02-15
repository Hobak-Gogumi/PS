package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] s = new long[N+1];
        long[] mod = new long[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            int num = Integer.parseInt(st.nextToken());
            s[i] = s[i-1] + num;
            mod[(int)(s[i]%M)]++;
        }

        long count = 0;
        count += mod[0];
        for(int i = 0; i < M; i++){
            if(mod[i] >= 2){
                count += (mod[i] * (mod[i]-1)) / 2;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}