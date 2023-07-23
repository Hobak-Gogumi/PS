package Baekjoon;

import java.io.*;

public class Baekjoon11726 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //DP배열 생성
        int[] D = new int[1001];
        D[1] = 1;
        D[2] = 2;
        for(int i = 3; i <= 1000; i++){
            D[i] = ((D[i-1]%10007) + (D[i-2]%10007)) % 10007;
        }

        //입력
        int n = Integer.parseInt(br.readLine());

        //출력
        bw.write(D[n] + "\n");
        bw.flush();
        bw.close();
    }

}