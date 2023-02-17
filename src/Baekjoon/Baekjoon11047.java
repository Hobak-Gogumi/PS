package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] c = new int[N];

       for(int i = 0; i < N; i++){
            c[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i = N-1; i >= 0; i--){
            if(c[i] > K){
               continue;
            } else{
                count += (K / c[i]);
                K = K % c[i];
            }

            if(K == 0)
                break;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}