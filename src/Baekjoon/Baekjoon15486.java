package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15486 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N+1][2];
        int[] D = new int[N+2]; //DP배열

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken()); //시간
            arr[i][1] = Integer.parseInt(st.nextToken()); //금액
        }
        //입력 종료

        //DP배열 채우기
        //D[i]: i일부터 N+1까지 벌 수 있는 최대금액
        for(int i = N; i >= 1; i--){
            if(i + arr[i][0] > N+1) //상담 일수 초과하면 i일때의 상담은 못함
                D[i] = D[i+1] + 0;
            else{
                D[i] = Math.max(D[i + arr[i][0]] + arr[i][1], D[i+1] + 0); //상담을 할 때와, 안 할때중 금액이 큰 것을 선택
            }
        }

        //출력
        bw.write(D[1] + "\n");
        bw.flush();
        bw.close();
    }

}