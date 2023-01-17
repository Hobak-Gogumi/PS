package Baekjoon;

import java.io.*;

public class Baekjoon2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int ans = 0;
        for(int i = 1; i < N; i++){
            int num = i;
            int sum = i;

            while(num != 0){
               sum = sum + (num % 10);
               num = num / 10;
            }

            if(sum == N){
                ans = i;
                break;
            }
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}