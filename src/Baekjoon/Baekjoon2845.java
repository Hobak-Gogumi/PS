package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine()); //첫째 줄
        int L = Integer.parseInt(st.nextToken()); //1m^2당 사람의 수
        int P = Integer.parseInt(st.nextToken()); //파티가 열렸던 곳의 넓이

        st = new StringTokenizer(br.readLine()); //둘째 줄
        int[] arr = new int[5]; //5개의 신문에 적혀있는 참가자의 수를 넣을 배열
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //입력 종료

        int right = L * P; //정확한 참가자 수
        for(int i = 0; i < 5; i++){ //차이 계산
            arr[i] = arr[i] - right;
        }

        //출력
        for(int i = 0; i < 5; i++){
            sb.append(arr[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}