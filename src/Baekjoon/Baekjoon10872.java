package Baekjoon;

import java.io.*;

public class Baekjoon10872 {

    public static void main(String[] args) throws IOException {
        // for문 이용한 풀이
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 1; // 0!, 1!은 1
        for(int i = 2; i <= N; i++){
            result *= i;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
        bw.close();
        */

        // 재귀 이용한 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = fac(N);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    public static int fac(int num){
        if(num <= 1){
            return 1;
        }
        return num * fac(num - 1);
    }

}
