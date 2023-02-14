package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //배열 입력받고 정렬하기
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        //찾는 정수들 입력받고 이진탐색 하기
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int t = Integer.parseInt(st.nextToken());
            int ans = 0;

            int start = 0;
            int end = N-1;
            int middle;

            while(start <= end){
                middle = (start + end) / 2;
                if(arr[middle] < t){
                    start = middle + 1;
                } else if(t < arr[middle]){
                    end = middle - 1;
                } else{
                    ans = 1;
                    break;
                }
            }

            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
    }
}