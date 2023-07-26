package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon14501 {

    static int N;

    static int[][] arr;

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1][2];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            
            arr[i][0] = Integer.parseInt(st.nextToken()); //시간
            arr[i][1] = Integer.parseInt(st.nextToken()); //금액
        }
        //입력 종료

        cal(1, 0);

        //출력
        bw.write(max + "\n");
        bw.flush();
        bw.close();
   }

   static void cal(int day, int sum){
        if(day == N+1){
            max = Math.max(max, sum);
            return;
        }

        if(day + arr[day][0] > N+1){
            //상담 불가능. 다음날로 넘어가자
            cal(day + 1, sum + 0);
        } else {
            //상담 가능. 이 날 상담을 선택하던지. 그냥 다음날 상담을 선택하던지.
            cal(day + arr[day][0], sum + arr[day][1]);
            cal(day + 1, sum + 0);
       }
   }
}