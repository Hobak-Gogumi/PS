package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //1부터 N까지 큐 채우기
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        bw.write("<");
        while(queue.size() != 1){
            for(int i = 1; i < K; i++){
                queue.add(queue.remove());
            }

            bw.write(queue.remove() + ", ");
        }

        bw.write(queue.remove() + ">");

        bw.flush();
        bw.close();

    }

}