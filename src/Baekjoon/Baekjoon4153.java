package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[3];

        while(true){
            // 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // 조건 체크
            if((arr[0] == 0) && (arr[1] == 0) && (arr[2] == 0))
                break;

            // 정렬
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 2-i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            // 계산
            if(arr[2] * arr[2] == (arr[0] * arr[0] + arr[1] * arr[1]))
                bw.write("right" + "\n");
            else
                bw.write("wrong" + "\n");

        }
        bw.flush();
        bw.close();

    }

}