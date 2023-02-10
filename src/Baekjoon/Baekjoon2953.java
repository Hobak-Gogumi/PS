package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2953 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr = new int[6]; //인덱스 5번까지 쓰기 위함

        // 입력
        for(int i = 1; i < 6; i++){
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++){
                sum += Integer.parseInt(st.nextToken());
            }

            arr[i] = sum;
        }

        //최댓값 찾기
        int max = 0;
        int max_index = 0;
        for(int i = 1; i < 6; i++){
            if(arr[i] > max){
                max = arr[i];
                max_index = i;
            }
        }

        bw.write(max_index + " " + max + "\n");
        bw.flush();
        bw.close();

    }

}