package Baekjoon;

import java.util.Scanner;

public class Baekjoon11659 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수의 개수
        int m = sc.nextInt(); // 합을 구해야 하는 횟수

        // 배열 생성, 입력받기
        int[] a = new int[n]; // 숫자를 입력받을 배열
        int[] s = new int[n]; // 합 배열

        int i = 0;
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // 합 배열 계산
        s[0] = a[0];
        for(i = 1; i < n; i++){
            s[i] = s[i-1] + a[i];
        }

        // 답을 넣을 배열 생성
        int[] result = new int[m];

        // m회 만큼 b부터 c까지의 합 구하기
        for(i = 0; i < m; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();


            if(b == 1){
                result[i] = s[c-1];
            }
            else{
                result[i] = s[c-1] - s[b-2];
            }
        }

        for(i = 0; i < m; i++){
            System.out.println(result[i]);
        }

        sc.close();
    }

}