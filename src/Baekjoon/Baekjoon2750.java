package Baekjoon;

import java.util.Scanner;

public class Baekjoon2750 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        // 배열 입력받기
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        // 배열 정렬하기
        for(int i = 1; i <= N-1; i++){
            for(int j = 0; j <= N-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 배열 출력하기
        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }

    }

}