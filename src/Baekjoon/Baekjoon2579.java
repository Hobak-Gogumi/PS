package Baekjoon;

import java.io.*;

public class Baekjoon2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //계단 개수 입력받기
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        //N개의 계단 점수 입력받기
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(N == 1){ //N이 1일경우, 아래 DP배열 채울 때 2접근해서 인덱스 에러남
            bw.write(arr[1] + "\n");
            bw.flush();
            bw.close();
            return;
        }

        //DP배열 생성
        //DP[i][0]: i-1에서 한 칸을 올라와서 i로 왔을때, 만들 수 있는 점수의 최대
        //DP[i][1]: i-2에서 두 칸을 올라와서 i로 왔을때, 만들 수 있는 점수의 최대
        int[][] DP = new int[N+1][2];

        DP[1][0] = arr[1];
        DP[2][0] = DP[1][0] + arr[2]; //1 -> 2
        DP[2][1] = arr[2]; //0 -> 2

        for(int i = 3; i <= N; i++){
            DP[i][0] = DP[i-1][1] + arr[i]; //연속된 3개를 밟을 수는 없으니, i-1을 만들때 2칸을 올라와서 만든 경우를 선택
            DP[i][1] = Math.max(DP[i-2][0], DP[i-2][1]) + arr[i]; //2칸을 올라와서 밟은것은 연속 3개를 밟는 경우를 신경쓸 필요 없음. i-2에 올라왔을때 점수 둘 중 큰 값에 더해주자.
        }

        int ans = Math.max(DP[N][0], DP[N][1]);

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

}