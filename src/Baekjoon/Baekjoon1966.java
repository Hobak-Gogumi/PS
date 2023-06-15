package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //테스트 케이스 수 입력 받기
        int T = Integer.parseInt(br.readLine());

        //테스트 케이스 수 만큼 반복문 진행
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //문서의 개수
            int M = Integer.parseInt(st.nextToken()); //순서가 궁금한 문서의 위치

            Queue<int[]> queue = new LinkedList<>();
            //N개의 문서 중요도 입력 받기
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                queue.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count = 1; //현재 프린터 출력 순서
            while(true){
                int[] item = queue.poll(); //현재 문서

                boolean flag = true; //출력 가능한지 상태

                for(int[] q : queue){
                    if(q[1] > item[1]){ //나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 있을 때
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    if(item[0] == M){
                        bw.write(count + "\n");
                        break;
                    }
                    else
                        count++;
                } else{
                    queue.offer(item);
                }
            }
        }

        bw.flush();
        bw.close();
    }

}