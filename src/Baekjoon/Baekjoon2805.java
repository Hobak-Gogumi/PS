package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //나무의 수
        int M = Integer.parseInt(st.nextToken()); //나무의 길이

        int[] trees = new int[N];

        st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE; //나무 중 최댓값을 저장
        for(int i = 0; i < N; i++){
            trees[i] = Integer.parseInt(st.nextToken());

            max = Math.max(trees[i], max);
        }
        //입력종료

        //이분탐색 시작
        int start = 0;
        int end = max;
        int middle = 0;

        int answer = 0;
        while(start <= end){
            middle = (start + end) / 2;

            long sum = 0;

            for(int i = 0; i < N; i++){
                if(trees[i] - middle > 0)
                    sum += (trees[i] - middle);
            }

            if(sum >= M){
                answer = middle;
                start = middle + 1;
            }
            else{
                end = middle - 1;
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}