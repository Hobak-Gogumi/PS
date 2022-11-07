package Baekjoon;

import java.util.Scanner;

public class Baekjoon10950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 케이스 개수 입력받은 후, 개수 크기만큼의 배열 생성
        int t = sc.nextInt();
        int[] arr = new int[t];

        // 입력, 계산
        for(int i = 0; i < t; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            arr[i] = n1 + n2;
        }

        // 출력
        for(int i = 0; i < t; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }

}
