package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //입력
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] sortArr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            arr[i] = n;
            sortArr[i] = n;
        }
        //입력 종료

        //배열 정렬
        Arrays.sort(sortArr);

        //작은 좌표의 개수를 맵에 넣기
        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for(int i = 0; i < N; i++){
            if(!map.containsKey(sortArr[i])){
                map.put(sortArr[i], index);
                index++;
            }
        }

        //출력하기
        for(int i = 0; i < N; i++){
            sb.append(map.get(arr[i])).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}