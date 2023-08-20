package Baekjoon;

import java.io.*;

public class Baekjoon9625 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine()); //버튼을 누르는 횟수

        int[][] arr = new int[K+1][2]; //0번열은 A의 개수, 1번열은 B의 개수

        arr[0][0] = 1;
        arr[0][1] = 0;

        for(int i = 1; i <= K; i++){
            //버튼을 누르기 전의 A개수와 B개수를 가져온다.
            int preA = arr[i-1][0];
            int preB = arr[i-1][1];

            //B가 BA로 바뀌므로, 그 전 B개수만큼 A를 가진다.
            arr[i][0] = preB;
            //B가 BA로 바뀌므로, 그 전 B개수만큼 B를 가진다.
            //A가 B로 바뀌므로, 그 전 A개수만큼 B를 가진다.
            arr[i][1] = preB + preA;
       }

        //출력
        sb.append(arr[K][0]).append(" ").append(arr[K][1]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}