package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N+1]; //인덱스가 N까지
        arr[1] = true;

        for(int i = 2; i <= Math.sqrt(N); i++){
            if(arr[i])
                continue;

            for(int j = i+1; j <= N; j++){
                if((j % i) == 0)
                    arr[j] = true;
            }
        }

        //출력
        for(int i = M; i <= N; i++){
            if(!arr[i])
                bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }

}