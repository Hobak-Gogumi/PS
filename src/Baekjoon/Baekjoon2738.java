package Baekjoon;

import java.util.Scanner;

public class Baekjoon2738 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        int i, j;

        // 배열 2개 입력받기
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        // 출력
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
