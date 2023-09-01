package Baekjoon;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Baekjoon11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //연산의 개수

        PriorityQueue<Integer> queue = new PriorityQueue<>(new AbsComparator()); //힙 생성

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x != 0){
                queue.add(x);
            }
            else if(x == 0){
                if(queue.isEmpty()){ //만약 배열이 비어있으면 0 출력
                    sb.append(0).append("\n");
                }
                else{ //가장 절댓값 작은 값 출력
                    int item = queue.remove();
                    sb.append(item).append("\n");
                }
            }
        }

        //출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}

class AbsComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(Math.abs(o1) != Math.abs(o2)){
            return Math.abs(o1) - Math.abs(o2);
        }
        else{ //절댓값이 같은 경우 더 작은값을 최소로
            return o1 - o2;
        }
    }

}