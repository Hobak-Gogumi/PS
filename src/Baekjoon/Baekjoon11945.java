package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11945 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = M-1; j >= 0; j--){
                bw.write(str.charAt(j));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

}