package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1697 {

    static int K;

    static int ans;

    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //수빈이의 위치
        K = Integer.parseInt(st.nextToken()); //동생의 위치
        //입력 종료

        //BFS 수행
        BFS(0, N);

        //출력
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }

    static void BFS(int second, int n){
        Queue<int[]> queue = new LinkedList<>();
        visited[n] = true;
        queue.add(new int[] {second, n}); //현재 시간과, 현재 위치를 넣을 큐를 생성

        while(!queue.isEmpty()){
            int[] now = queue.remove();
            int time = now[0];
            int val = now[1];

            if(val == K){
                ans = time;
                return;
            }

            if(((val - 1) >= 0) && ((val - 1) <= 100000) && (!visited[val - 1])){
                visited[val-1] = true;
                queue.add(new int[] {time+1, val-1});
            }
            if(((val + 1) >= 0) && ((val + 1) <= 100000) && (!visited[val + 1])){
                visited[val+1] = true;
                queue.add(new int[] {time+1, val+1});
            }
            if(((val * 2) >= 0) && ((val * 2) <= 100000) && (!visited[val * 2])){
                visited[val*2] = true;
                queue.add(new int[] {time+1, val*2});
            }
        }
    }

}