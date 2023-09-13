package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[3]; //세 변의 길이를 저장할 배열

        //세 변의 길이 입력받기
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //정렬
        Arrays.sort(arr);

        //가장 긴 변의 길이는 다른 두 변의 길이의 합 보다 작아야 한다는 조건을 가지고 가장 긴 변의 길이를 정해주기
        if(arr[0] + arr[1] <= arr[2]){
            arr[2] = arr[0] + arr[1] - 1;
        }

        //세 변의 길이의 합 구하기
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += arr[i];
        }

        //출력
        bw.write(String.valueOf(sum) + "\n");
        bw.flush();
        bw.close();

    }

}