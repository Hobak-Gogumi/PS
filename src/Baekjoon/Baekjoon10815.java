package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10815 {

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //숫자 카드 입력 받기
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        //찾아야 하는 수 입력 받기, 검사 후 결과 출력
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());

            if(binarySearch(num))
                bw.write("1 ");
            else
                bw.write("0 ");
        }

        bw.flush();
        bw.close();
    }

    //이진탐색 메서드. 찾는수(num)이 arr 배열에 존재하면 true 반환
    static boolean binarySearch(int num){
        int start = 0;
        int end = N-1;
        int middle = (start + end) / 2;

        boolean isExist = false;
        while(start <= end){
            if(num == arr[middle]){
                isExist = true;
                break;
            } else if(num < arr[middle]){
                end = middle - 1;
                middle = (start + end) / 2;
            } else if(num > arr[middle]){
                start = middle + 1;
                middle = (start + end) / 2;
            }
        }

        return isExist;
    }

}