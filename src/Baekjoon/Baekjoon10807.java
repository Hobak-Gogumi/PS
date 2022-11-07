package Baekjoon;

import java.util.Scanner;

public class Baekjoon10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수의 개수 입력
        int n = sc.nextInt();

        // 정수의 개수만큼의 크기를 가진 배열 생성
        int[] arr = new int[n];

        // 정수들 입력 받기
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // 찾으려는 정수 입력
        int v = sc.nextInt();

        // 정수 개수 출력
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == v){
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }

}
