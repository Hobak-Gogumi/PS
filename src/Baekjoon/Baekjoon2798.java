package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = new int[N];

        //카드 입력받기
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        //모든 경우의 수 탐색
        int max = 0;
        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int m = j+1; m < N; m++){
                    int sum = card[i] + card[j] + card[m];
                    if(sum > M)
                        continue;
                    else{
                        if(sum > max)
                            max = sum;
                    }
                }
            }
        }

        bw.write(max+ "\n");
        bw.flush();
        bw.close();

    }

}