package Baekjoon;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Baekjoon11279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //연산의 개수

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x > 0){ //x가 자연수라면 배열에 x라는 값을 넣는 연산
                queue.add(x);
            }
            else if(x == 0){ //x가 0일때
                if(queue.isEmpty()){ //배열이 비어있으면 0 출력
                    sb.append(0).append("\n");
                }
                else{ //배열이 비어있지 않으면 가장 큰 값 출력
                    int n = queue.remove();
                    sb.append(n).append("\n");
                }
            }
        }

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}