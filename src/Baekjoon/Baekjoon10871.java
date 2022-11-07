package Baekjoon;

import java.util.Scanner;

public class Baekjoon10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 배열의 크기
        int x = sc.nextInt(); // x보다 작은 수를 출력하는 것이 목표

        int[] a = new int[n];

        // 배열 입력받기
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // 배열 돌면서 x보다 작은 수 찾기
        for(int i = 0; i < n; i++){
            if(a[i] < x){
                System.out.print(a[i] + " ");
            }
        }

        sc.close();
    }

}
