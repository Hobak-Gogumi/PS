package Baekjoon;

import java.util.Scanner;

public class Baekjoon2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int i, j;
        for(i = 0; i < 9; i++){
            for(j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0, maxi = 0, maxj = 0;
        for(i = 0; i < 9; i++){
            for(j = 0; j < 9; j++){
                if(arr[i][j] >= max){
                    max = arr[i][j];
                    maxi = i + 1;
                    maxj = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxi + " " + maxj);

        sc.close();
    }

}
