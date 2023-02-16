package Baekjoon;

import java.io.*;

public class Baekjoon2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int ans = -1;
        int A = N / 5; //5킬로그램 봉지 개수
        int B; //3킬로그램 봉지 개수
        while(0 <= A){
            if((N-(5*A)) % 3 == 0){
                B = (N-(5*A)) / 3;
                ans = A + B;
                break;
            } else{
                A--;
            }
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}