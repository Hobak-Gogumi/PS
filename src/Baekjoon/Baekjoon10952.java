package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(; ;){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if((A == 0) && (B == 0)){
                break;
            } else{
                bw.write(String.valueOf(A+B));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}