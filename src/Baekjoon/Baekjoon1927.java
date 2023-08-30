package Baekjoon;

import java.io.*;
import java.util.PriorityQueue;

public class Baekjoon1927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //연산의 개수

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x > 0){ //x가 자연수라면 배열에 x값을 넣는 연산
                queue.add(x);
            }
            else if(x == 0){ //x가 0이라면
                if(!queue.isEmpty()){ //배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거
                    int min = queue.remove();
                    sb.append(min).append("\n");
                }
                else{ //만약 배열이 비어있다면 0을 출력
                    sb.append(0).append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}