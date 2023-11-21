package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon14489 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        int answer = 0;
        if(2*C <= (A+B)){
            answer = (A+B-2*C);
        }
        else{
            answer = A+B;
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}