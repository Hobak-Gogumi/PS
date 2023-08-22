package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1629 {

    static long A;
    static long C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
        //입력 종료

        long answer = sol(B);

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    static long sol(long B){
        if(B == 1)
            return A % C;
        else{
            long half = sol(B/2);
            if((B % 2) == 0){
                return half * half % C;
            }
            else{
                return (half *  half  % C) * A % C;
            }
        }
    }

}