package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon18352 {

    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static int[] moves;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //도시의 개수
        int M = Integer.parseInt(st.nextToken()); //도로의 개수
        int K = Integer.parseInt(st.nextToken()); //거리 정보
        int X = Integer.parseInt(st.nextToken()); //출발 도시의 번호

        //인접 리스트 선언
        arrayList = new ArrayList[N+1];
        for(int i = 0; i < arrayList.length; i++){
            arrayList[i] = new ArrayList<>();
        }

        //방문 배열 선언
        visited = new boolean[N+1];

        //이동 횟수를 넣을 배열 선언
        moves = new int[N+1];

        //도로 정보 입력받기
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arrayList[a].add(b);
            //단방향도로 이므로 한쪽만 추가해준다.
        }

        //BFS 수행
        BFS(X);

        //moves탐색하면서, K와 같은 값을 가진 인덱스를 answer ArrayList에 넣는다.
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            if(moves[i] == K)
                answer.add(i);
        }

        //answer 리스트가 비어있으면 -1 출력, 안 비어있으면 요소들 출력
        if(answer.size() == 0){
            sb.append(-1).append("\n");
        } else{
            for(int a : answer)
                sb.append(a).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void BFS(int s){
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){
            int now = queue.remove();

            for(int n : arrayList[now]){
                if(!visited[n]){
                    moves[n] = moves[now] + 1;
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

}