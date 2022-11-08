package Baekjoon;

import java.util.Scanner;

public class Baekjoon1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째 줄에는 시험 본 과목의 개수 N이 주어짐
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 둘째 줄에 세준이의 현재 성적이 주어짐
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        // 최대값 구하기
        double max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            sum = sum + arr[i];
        }

        // 새로운 평균 구하기
        System.out.println(sum * 100.0 / max / n);

        sc.close();
    }

}
