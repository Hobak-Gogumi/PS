package Baekjoon;

import java.util.Scanner;

public class Baekjoon11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 개수 N 입력받기
        int n = sc.nextInt();

        // 숫자 N개 입력받기
        String s = sc.next();

        // char형 배열로 변환시켜줌
        char[] arr = s.toCharArray();

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
//            sum += (arr[i] - 48);
            sum += (arr[i] - '0');
        }

        System.out.println(sum);

        sc.close();
    }

}