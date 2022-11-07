package Baekjoon;

import java.util.Scanner;

public class Baekjoon5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a[0] ~ a[30]
        int[] arr = new int[31];

        // 28명의 번호를 받음. 받은 번호는 배열을 1로 변경
        for(int i = 0; i < 28; i++){
            int n = sc.nextInt();
            arr[n] = 1;
        }

        // 30명 배열을 돌면서 값이 0이면(제출 x) 출력
        for(int i = 1; i < 31; i++){
            if(arr[i] == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
