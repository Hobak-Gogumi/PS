package Baekjoon;

import java.util.Scanner;

public class Baekjoon11660 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt(); // 합을 구하는 횟수

        int[][] arr = new int[N+1][N+1];
        int[][] sumarr = new int[N+1][N+1];

        int[] result = new int[M];

        // 배열 입력받기
        int i, j;
        for(i = 1; i <= N; i++){
            for(j = 1; j <= N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 합 배열 만들기
        sumarr[1][1] = arr[1][1]; // 1번 단계

        // 2번 단계
        for(i = 2; i <= N; i++){
            sumarr[1][i] = sumarr[1][i-1] + arr[1][i];
        }
        for(i = 2; i <= N; i++){
            sumarr[i][1] = sumarr[i-1][1] + arr[i][1];
        }

        // 3번 단계
        for(i = 2; i <= N; i++){
            for(j = 2; j <= N; j++){
                sumarr[i][j] = sumarr[i-1][j] + sumarr[i][j-1] + arr[i][j] - sumarr[i-1][j-1];
            }
        }
        // --- 합 배열 생성 끝

        for(i = 0; i < M; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            result[i] = sumarr[x2][y2] - sumarr[x1-1][y2] - sumarr[x2][y1-1] + sumarr[x1-1][y1-1];
        }

        for(i = 0; i < M; i++){
            System.out.println(result[i]);
        }

    }
}
